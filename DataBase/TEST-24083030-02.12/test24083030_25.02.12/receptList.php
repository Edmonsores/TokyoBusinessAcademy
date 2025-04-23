<?php
// Include database connection
include("config.php");

// Page number for pagination
$req_page = $_POST['page'] ?? 1;
if ($req_page <= 0) $req_page = 1;
$page_count = 5; // Number of receipts per page

// Search input
$txt_search = $_POST['txt_search'] ?? "";

// Connect to database
try {
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Connection failed: " . $e->getMessage());
}

// Handling receipt deletion (soft delete)
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['hid_receipt_no']) && $_POST['hid_receipt_no'] !== "") {
    try {
        $sql = "UPDATE test24083030_receipt_tbl SET delete_ku = '1' WHERE receipt_no = :receipt_no";
        $stmt = $dbh->prepare($sql);
        $stmt->bindValue(':receipt_no', $_POST['hid_receipt_no'], PDO::PARAM_INT);
        $stmt->execute();
    } catch (PDOException $e) {
        die($e->getMessage());
    }
}

// Count total receipts for pagination
try {
    $sql = "SELECT COUNT(receipt_no) AS count FROM test24083030_receipt_tbl WHERE delete_ku = '0'";
    if ($txt_search != "") {
        $sql .= " AND receipt_no LIKE :txt_search";
    }
    $stmt = $dbh->prepare($sql);
    if ($txt_search != "") $stmt->bindValue(':txt_search', "%$txt_search%", PDO::PARAM_STR);
    $stmt->execute();
    $count = $stmt->fetchColumn();
} catch (PDOException $e) {
    die($e->getMessage());
}

// Fetch receipt records
try {
    $sql = "SELECT receipt_no, date_nb, customer_no, insert_at, update_at FROM test24083030_receipt_tbl WHERE delete_ku = '0'";
    if ($txt_search != "") {
        $sql .= " AND receipt_no LIKE :txt_search";
    }
    $sql .= " ORDER BY update_at DESC LIMIT :page_count OFFSET :page_start";
    $stmt = $dbh->prepare($sql);
    $stmt->bindValue(':page_count', $page_count, PDO::PARAM_INT);
    $stmt->bindValue(':page_start', ($req_page - 1) * $page_count, PDO::PARAM_INT);
    if ($txt_search != "") $stmt->bindValue(':txt_search', "%$txt_search%", PDO::PARAM_STR);
    $stmt->execute();
    $receipts = $stmt->fetchAll(PDO::FETCH_ASSOC);
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
    <title>Receipt Management</title>
    <script type="text/javascript">
        function deleteReceipt(receiptNo) {
            if (confirm("この領収書を削除してもよろしいですか?")) {
                document.getElementById('hid_receipt_no').value = receiptNo;
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

<div style="text-align: center; margin-top: 20px;"><b>領収書管理</b></div>
<div style="margin-top: 10px; text-align: center;">
    <a href="menu.php">メニューに戻る</a>
</div>

<form name="fr01" action="" method="POST">
    <input type="hidden" id="page" name="page" value="<?php echo $req_page; ?>">
    <input type="hidden" id="hid_receipt_no" name="hid_receipt_no" value="">

    <table border="1" cellpadding="5" style="width: 70%; margin: auto;">
        <tr>
            <th style="background-color: #3498db; width: 35%;">領収書番号を検索</th>
            <td><input type="text" name="txt_search" value="<?php echo $txt_search; ?>"></td>
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
    <th style="background-color: #3498db;">Receipt No</th>
    <th style="background-color: #3498db;">Date</th>
    <th style="background-color: #3498db;">Customer No</th>
    <th style="background-color: #3498db;">Insert At</th>
    <th style="background-color: #3498db;">Update At</th>
    <th style="background-color: #3498db;">機能</th>
    </tr>
    <?php foreach ($receipts as $receipt): ?>
        <tr>
            <td><?php echo $receipt['receipt_no']; ?></td>
            <td><?php echo $receipt['date_nb']; ?></td>
            <td>
            <a href="customerList.php?customer_no=<?php echo $receipt['customer_no']; ?>">
            <?php echo $receipt['customer_no']; ?>
            </a>
            </td>
            <td><?php echo $receipt['insert_at']; ?></td>
            <td><?php echo $receipt['update_at']; ?></td>
            <td>
                <a href="javascript:;" onclick="deleteReceipt(<?php echo $receipt['receipt_no']; ?>);">＜削除＞</a>
            </td>
        </tr>
    <?php endforeach; ?>
</table>

</body>
</html>
