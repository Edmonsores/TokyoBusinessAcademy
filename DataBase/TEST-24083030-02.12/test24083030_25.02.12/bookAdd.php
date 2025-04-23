<?php

//Stores database connection information
include("config.php");

//Initial variable declaration
$txt_book_name = "";
$txt_book_genre = "";
$txt_price_nb = "";

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTGet Data
    $txt_book_name = $_POST['txt_book_name'];
    $txt_book_genre = $_POST['txt_book_genre'];
    $txt_price_nb = $_POST['txt_price_nb'];

    $err = "";

    if($txt_book_name == ""){
        $err .= "【本の名前】";
    }
    if($txt_book_genre == ""){
        $err .= "【ジャンル】";
    }
    if($txt_price_nb == ""){
        $err .= "【価格】";
    }

    if($err == ""){

        $sql = "INSERT INTO test24083030_book_mst ("
                ." book_name"
                .",book_genre"
                .",price_nb"
                .",delete_ku"
                .",insert_at"
                .",update_at"
                .") VALUES ("
                .":book_name"
                .",:book_genre"
                .",:price_nb"
                .",'0'"
                .",NOW()"
                .",NOW()"
                .");";

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':book_name', $txt_book_name, PDO::PARAM_STR);
            $stmt->bindValue(':book_genre', $txt_book_genre, PDO::PARAM_STR);
            $stmt->bindValue(':price_nb', $txt_price_nb, PDO::PARAM_STR);
            $stmt->execute();

            header("Location:bookList.php");
        } catch(Exception $e){
            echo "データの書き込みに失敗しました。". $e->getMessage();
        }
    }else{
        echo $err."を修正してください。";
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
        <h2>本の登録</h2>
        <a class="back-link" href="bookList.php">一覧へ戻る</a> 
        <p> </p>  
<form action="" method="POST">
    本の名前<br>
    <input type="text" name="txt_book_name" value="<?php echo $txt_book_name; ?>" /><br>
    ジャンル<br>
    <input type="text" name="txt_book_genre" value="<?php echo $txt_book_genre; ?>" /><br>
    価格<br>
    <input type="text" name="txt_price_nb" value="<?php echo $txt_price_nb; ?>" /><br>
    <br>
    <input type="submit" value="登録">
</form>
</div>
</body>
</html>
