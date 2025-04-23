
<?php
// Include database connection
include("config.php");

// Page number for pagination
$req_page = $_POST['page'] ?? 1;
if ($req_page <= 0) $req_page = 1;
$page_count = 5; // Number of books per page

// Search and filter inputs
$txt_search = $_POST['txt_search'] ?? "";
$sel_genre = $_POST['sel_genre'] ?? "";

// Display type (soft delete logic)
$rad_display_type = $_POST['rad_display_type'] ?? "";

// Connect to database
try {
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Connection failed: " . $e->getMessage());
}

// Fetch book genres for the select dropdown
try {
    $sql = "SELECT DISTINCT book_genre FROM test24083030_book_mst WHERE delete_ku = '0 ' ORDER BY book_genre";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();
    $genres = $stmt->fetchAll(PDO::FETCH_ASSOC);
} catch (PDOException $e) {
    die($e->getMessage());
}

// Handling book deletion (soft delete)
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['hid_book_no']) && $_POST['hid_book_no'] !== "") {
    try {
        $sql = "UPDATE test24083030_book_mst SET delete_ku = '1' WHERE book_no = :book_no";
        $stmt = $dbh->prepare($sql);
        $stmt->bindValue(':book_no', $_POST['hid_book_no'], PDO::PARAM_INT);
        $stmt->execute();
    } catch (PDOException $e) {
        die($e->getMessage());
    }
}

// Count total books for pagination
try {
    $sql = "SELECT COUNT(book_no) AS count FROM test24083030_book_mst WHERE delete_ku = '0'";
    
    if ($txt_search != "") {
        $sql .= " AND book_name LIKE :txt_search";
    }
    if ($sel_genre != "") {
        $sql .= " AND book_genre = :sel_genre";
    }

    $stmt = $dbh->prepare($sql);
    if ($txt_search != "") $stmt->bindValue(':txt_search', "%$txt_search%", PDO::PARAM_STR);
    if ($sel_genre != "") $stmt->bindValue(':sel_genre', $sel_genre, PDO::PARAM_STR);
    $stmt->execute();

    $count = $stmt->fetchColumn();
} catch (PDOException $e) {
    die($e->getMessage());
}

// Fetch book records
try {
    $sql = "SELECT book_no, book_name, book_genre, price_nb, update_at FROM test24083030_book_mst WHERE delete_ku = '0'";
    
    if ($txt_search != "") {
        $sql .= " AND book_name LIKE :txt_search";
    }
    if ($sel_genre != "") {
        $sql .= " AND book_genre = :sel_genre";
    }

    $sql .= " ORDER BY update_at DESC LIMIT :page_count OFFSET :page_start";

    $stmt = $dbh->prepare($sql);
    $stmt->bindValue(':page_count', $page_count, PDO::PARAM_INT);
    $stmt->bindValue(':page_start', ($req_page - 1) * $page_count, PDO::PARAM_INT);
    
    if ($txt_search != "") $stmt->bindValue(':txt_search', "%$txt_search%", PDO::PARAM_STR);
    if ($sel_genre != "") $stmt->bindValue(':sel_genre', $sel_genre, PDO::PARAM_STR);

    $stmt->execute();
    $books = $stmt->fetchAll(PDO::FETCH_ASSOC);
} catch (PDOException $e) {
    die($e->getMessage());
}

// Pagination logic
$max_page = ceil($count / $page_count);
$prev_page = ($req_page > 1) ? $req_page - 1 : 1;
$next_page = ($req_page < $max_page) ? $req_page + 1 : $max_page;
?>

<!DOCTYPE html>
<html>
<head>
    <title>Book Management</title>
    <script type="text/javascript">
        function deleteBook(bookNo) {
            if (confirm("この本を削除してもよろしいですか?")) {
                document.getElementById('hid_book_no').value = bookNo;
                document.fr01.submit();
            }
        }
        function changePage(pageNo) {
            document.getElementById('page').value = pageNo;
            document.fr01.submit();
        }
    </script>
</head>
<body style="background-color: #f4f4f4;">

<div style="text-align: center; margin-top: 20px;"><b>本管理</b></div>
<div style="margin-top: 10px; text-align: center;">
    <a href="bookAdd.php">新しい本を追加</a> | <a href="menu.php">メニューに戻る</a>
</div>

<form name="fr01" action="" method="POST">
    <input type="hidden" id="page" name="page" value="<?php echo $req_page; ?>">
    <input type="hidden" id="hid_book_no" name="hid_book_no" value="">

    <table border="1" cellpadding="5" style="width: 70%; margin: auto;">
        <tr>
            <th style="background-color: #3498db; width: 35%;">本名を検索</th>
            <td><input type="text" name="txt_search" value="<?php echo $txt_search; ?>"></td>
        </tr>
        <tr>
            <th style="background-color: #3498db;">ジャンルを選択</th>
            <td>
                <select name="sel_genre">
                    <option value="">-- ジャンルを選択 --</option>
                    <?php foreach ($genres as $genre): ?>
                        <option value="<?php echo $genre['book_genre']; ?>" 
                            <?php if ($sel_genre == $genre['book_genre']) echo "selected"; ?>>
                            <?php echo $genre['book_genre']; ?>
                        </option>
                    <?php endforeach; ?>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;"><input type="submit" value="検索"></td>
        </tr>
    </table>
</form>

<div style="text-align: center; margin: 20px;">
    Page: <?php echo $req_page; ?> / <?php echo $max_page; ?>
    <a href="javascript:;" onclick="changePage(<?php echo $prev_page; ?>);">前</a> | 
    <a href="javascript:;" onclick="changePage(<?php echo $next_page; ?>);">次</a>
</div>

<table border="1" width="80%" align="center">
    <tr>
    <th style="background-color: #3498db;">Book_No</th>
    <th style="background-color: #3498db;">Title</th>
    <th style="background-color: #3498db;">Genre</th>
    <th style="background-color: #3498db;">Price</th>
    <th style="background-color: #3498db;">UPDATE_AT</th>
    <th style="background-color: #3498db;">機能</th>
    </tr>
    <?php foreach ($books as $book): ?>
        <tr>
            <td><?php echo $book['book_no']; ?></td>
            <td><?php echo $book['book_name']; ?></td>
            <td><?php echo $book['book_genre']; ?></td>
            <td><?php echo number_format($book['price_nb'], 2); ?></td>
            <td><?php echo $book['update_at']; ?></td>
            <td>
                <a href="bookUpd.php?book_no=<?php echo $book['book_no']; ?>">＜更新＞</a> | 
                <a href="javascript:;" onclick="deleteBook(<?php echo $book['book_no']; ?>);">＜削除＞</a>
            </td>
        </tr>
    <?php endforeach; ?>
</table>

</body>
</html>
