<?php

//データベース接続情報を格納
include("config.php");

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTデータの取得
    $txt_title_kj = $_POST['txt_title_kj'];
    $txt_article_kj = $_POST['txt_article_kj'];

    $err = "";

    if($txt_title_kj == ""){
        $err .= "【件名】";
    }
    if($txt_article_kj == ""){
        $err .= "【内容】";
    }

    if($err == ""){

        $sql = "insert into s24083030_news_tbl("
                ."title_kj"
                .",article_kj"
                .",delete_ku"
                .",insert_at"
                .",update_at"
                .") values ("
                .":title_kj"
                .",:article_kj"
                .",'0'"
                .",now()"
                .",now()"
                .");";
        $dbh = new PDO($dsn, $user, $password);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':title_kj', $txt_title_kj, PDO::PARAM_STR);
            $stmt->bindValue(':article_kj', $txt_article_kj, PDO::PARAM_STR);
            $stmt->execute();

            header("Location:newslist.php");
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
<h1>ニュース登録</h1>
<form action="newsAdd.php" method="POST">
    件名<br>
    <input type="text" name="txt_title_kj" /><br>
    内容<br>
    <textarea name="txt_article_kj" style="width:300px;height:150px;"></textarea><br>
    <input type="submit" value="投稿">
</form>
</body>
</html>
