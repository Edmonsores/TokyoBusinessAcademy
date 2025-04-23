<?php
// Include database connection
include("config.php");

// Page number for pagination
$req_page = $_POST['page'] ?? 1;
if ($req_page <= 0) $req_page = 1;
$page_count = 5; // Number of consumers per page

// Search input
$txt_search = $_POST['txt_search'] ?? "";

// Connect to database
try {
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Connection failed: " . $e->getMessage());
}

// Handling consumer deletion (soft delete)
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['hid_customer_no']) && $_POST['hid_customer_no'] !== "") {
    try {
        $sql = "UPDATE test24083030_consumer_mst SET delete_ku = '1' WHERE customer_no = :customer_no";
        $stmt = $dbh->prepare($sql);
        $stmt->bindValue(':customer_no', $_POST['hid_customer_no'], PDO::PARAM_INT);
        $stmt->execute();
    } catch (PDOException $e) {
        die($e->getMessage());
    }
}

// Count total consumers for pagination
try {
    $sql = "SELECT COUNT(customer_no) AS count FROM test24083030_consumer_mst WHERE delete_ku = '0'";
    if ($txt_search != "") {
        $sql .= " AND customer_name LIKE :txt_search";
    }
    $stmt = $dbh->prepare($sql);
    if ($txt_search != "") $stmt->bindValue(':txt_search', "%$txt_search%", PDO::PARAM_STR);
    $stmt->execute();
    $count = $stmt->fetchColumn();
} catch (PDOException $e) {
    die($e->getMessage());
}

// Fetch consumer records
try {
    $sql = "SELECT customer_no, customer_name, phone_number, insert_at, update_at FROM test24083030_consumer_mst WHERE delete_ku = '0'";
    if ($txt_search != "") {
        $sql .= " AND customer_name LIKE :txt_search";
    }
    $sql .= " ORDER BY update_at DESC LIMIT :page_count OFFSET :page_start";
    $stmt = $dbh->prepare($sql);
    $stmt->bindValue(':page_count', $page_count, PDO::PARAM_INT);
    $stmt->bindValue(':page_start', ($req_page - 1) * $page_count, PDO::PARAM_INT);
    if ($txt_search != "") $stmt->bindValue(':txt_search', "%$txt_search%", PDO::PARAM_STR);
    $stmt->execute();
    $consumers = $stmt->fetchAll(PDO::FETCH_ASSOC);
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
    <title>Consumer Management</title>
    <script type="text/javascript">
        function deleteConsumer(customerNo) {
            if (confirm("この顧客を削除してもよろしいですか?")) {
                document.getElementById('hid_customer_no').value = customerNo;
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

<div style="text-align: center; margin-top: 20px;"><b>顧客管理</b></div>
<div style="margin-top: 10px; text-align: center;">
    <a href="customerAdd.php">新しい顧客を追加</a> | <a href="menu.php">メニューに戻る</a>
</div>

<form name="fr01" action="" method="POST">
    <input type="hidden" id="page" name="page" value="<?php echo $req_page; ?>">
    <input type="hidden" id="hid_customer_no" name="hid_customer_no" value="">

    <table border="1" cellpadding="5" style="width: 70%; margin: auto;">
        <tr>
            <th style="background-color: #3498db; width: 35%;">顧客名を検索</th>
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
    <th style="background-color: #3498db;">Customer_No</th>
    <th style="background-color: #3498db;">Customer Name</th>
    <th style="background-color: #3498db;">Phone Number</th>
    <th style="background-color: #3498db;">Insert At</th>
    <th style="background-color: #3498db;">Update At</th>
    <th style="background-color: #3498db;">機能</th>
    </tr>
    <?php foreach ($consumers as $consumer): ?>
        <tr>
            <td><?php echo $consumer['customer_no']; ?></td>
            <td><?php echo $consumer['customer_name']; ?></td>
            <td><?php echo $consumer['phone_number']; ?></td>
            <td><?php echo $consumer['insert_at']; ?></td>
            <td><?php echo $consumer['update_at']; ?></td>
            <td>
                <a href="customerUpd.php?customer_no=<?php echo $consumer['customer_no']; ?>">＜更新＞</a> | 
                <a href="javascript:;" onclick="deleteConsumer(<?php echo $consumer['customer_no']; ?>);">＜削除＞</a>
            </td>
        </tr>
    <?php endforeach; ?>
</table>

</body>
</html>
