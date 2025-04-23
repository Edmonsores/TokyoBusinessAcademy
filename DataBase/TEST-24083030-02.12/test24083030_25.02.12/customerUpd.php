<?php

// Include database connection
include("config.php");

// Initialize variables
$txt_customer_name = "";
$txt_phone_number = "";

if ($_SERVER['REQUEST_METHOD'] === 'GET') {
    // Get consumer ID from request
    $req_customer_no = $_GET['customer_no'] ?? "";
    
    if ($req_customer_no == "") {
        header('Location: customerList.php');
        exit();
    }
}

try {
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die($e->getMessage());
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Get POST data
    $req_customer_no = $_POST['hid_customer_no'];
    $txt_customer_name = $_POST['txt_customer_name'];
    $txt_phone_number = $_POST['txt_phone_number'];
    
    $err = "";
    
    if ($txt_customer_name == "") {
        $err .= "【名前】";
    }
    
    if ($txt_phone_number == "") {
        $err .= "【電話番号】";
    }
    
    if ($err == "") {
        try {
            $sql = "UPDATE test24083030_consumer_mst SET 
                    customer_name = :customer_name,
                    phone_number = :phone_number,
                    update_at = NOW()
                    WHERE customer_no = :customer_no";
            
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':customer_no', $req_customer_no, PDO::PARAM_INT);
            $stmt->bindValue(':customer_name', $txt_customer_name, PDO::PARAM_STR);
            $stmt->bindValue(':phone_number', $txt_phone_number, PDO::PARAM_STR);
            $stmt->execute();
            
            header("Location: customerList.php");
            exit();
        } catch (Exception $e) {
            die("データの更新に失敗しました: " . $e->getMessage());
        }
    } else {
        echo $err . "を修正してください。";
    }
} else {
    // Fetch customer data for editing
    try {
        $sql = "SELECT customer_no, customer_name, phone_number FROM test24083030_consumer_mst WHERE customer_no = :customer_no";
        $stmt = $dbh->prepare($sql);
        $stmt->bindValue(':customer_no', $req_customer_no, PDO::PARAM_INT);
        $stmt->execute();
        $result = $stmt->fetch();
        
        $txt_customer_name = $result["customer_name"];
        $txt_phone_number = $result["phone_number"];
    } catch (PDOException $e) {
        die($e->getMessage());
    }
}
?>
<html>
<body>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        h2 {
            color: #333;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background: #3498db;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background: #286090;
        }
        .back-link {
            display: inline-block;
            margin-top: 10px;
            text-decoration: none;
            color: white;
            background: #3498db;
            padding: 10px 15px;
            border-radius: 4px;
            font-size: 14px;
        }
        .back-link:hover {
            background: #286090;
        }
    </style>
    
<div class="container">
        <h2>顧客の更新</h2>
        <a class="back-link" href="customerList.php">一覧へ戻る</a> 
        <p> </p>  
<form action="" method="POST">
    <input type="hidden" name="hid_customer_no" value="<?php echo $req_customer_no; ?>">
    名前<br>
    <input type="text" name="txt_customer_name" value="<?php echo $txt_customer_name; ?>" /><br>
    電話番号<br>
    <input type="text" name="txt_phone_number" value="<?php echo $txt_phone_number; ?>" /><br>
    <br>
    <input type="submit" value="更新">
</form>
</div>
</body>
</html>
