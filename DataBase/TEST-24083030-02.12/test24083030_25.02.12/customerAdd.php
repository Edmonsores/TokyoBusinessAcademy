<?php

// Include database connection
include("config.php");

// Initialize variables
$txt_customer_name = "";
$txt_phone_number = "";

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    
    // Retrieve POST data
    $txt_customer_name = $_POST['txt_customer_name'];
    $txt_phone_number = $_POST['txt_phone_number'];
    
    $err = "";
    
    if ($txt_customer_name == "") {
        $err .= "【顧客名】";
    }
    
    if ($txt_phone_number == "") {
        $err .= "【電話番号】";
    }
    
    if ($err == "") {
        try {
            // Start transaction
            $dbh->beginTransaction();

            // Insert consumer
            $sql = "INSERT INTO test24083030_consumer_mst (
                        customer_name,
                        phone_number,
                        delete_ku,
                        insert_at,
                        update_at
                    ) VALUES (
                        :customer_name,
                        :phone_number,
                        '0',
                        NOW(),
                        NOW()
                    );";
            
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':customer_name', $txt_customer_name, PDO::PARAM_STR);
            $stmt->bindValue(':phone_number', $txt_phone_number, PDO::PARAM_STR);
            $stmt->execute();
            
            // Get last inserted customer ID
            $customer_no = $dbh->lastInsertId();
            
            // Insert receipt for the new customer
            $sql = "INSERT INTO test24083030_receipt_tbl (
                        date_nb,
                        customer_no,
                        delete_ku,
                        insert_at,
                        update_at
                    ) VALUES (
                        NOW(),
                        :customer_no,
                        '0',
                        NOW(),
                        NOW()
                    );";
            
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':customer_no', $customer_no, PDO::PARAM_INT);
            $stmt->execute();
            
            // Commit transaction
            $dbh->commit();

            header("Location: customerList.php");
            exit;
        } catch (Exception $e) {
            $dbh->rollBack(); // Rollback transaction on failure
            echo "データの書き込みに失敗しました。" . $e->getMessage();
        }
    } else {
        echo $err . "を修正してください。";
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
        <h2>顧客登録</h2>
        <a class="back-link" href="customerList.php">一覧へ戻る</a> 
        <p> </p>  
        <form action="" method="POST">
            顧客名<br>
            <input type="text" name="txt_customer_name" value="<?php echo $txt_customer_name; ?>" /><br>
            電話番号<br>
            <input type="text" name="txt_phone_number" value="<?php echo $txt_phone_number; ?>" /><br>
            <br>
            <input type="submit" value="登録">
        </form>
    </div>
</body>
</html>
