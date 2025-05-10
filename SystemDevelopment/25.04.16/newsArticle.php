<?php

//データベース接続情報を格納
include("config.php");

//GETで値を受け取る
if($_SERVER['REQUEST_METHOD'] === 'GET'){
    $seq_no = $_GET['seq_no'];
}

try{
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $sql = "select"
            ." nt.seq_no"
            .",nt.title_kj"
            .",nt.article_kj"
            .",nt.insert_at"
            ." from s24083030_news_tbl nt"
            ." where nt.seq_no = :seq_no";
    $stmt = $dbh->prepare($sql);
    $stmt->bindValue(':seq_no', $seq_no , PDO::PARAM_INT);
    $stmt->execute();
    $result = $stmt->fetch();
}catch (PDOException $e){
    echo($e->getMessage());
    die();
}
?>

<html>
<body>
<h1><?php echo htmlspecialchars($result['title_kj'],ENT_QUOTES,"UTF-8"); ?></h1>
<div>
    <?php
        $Date = date($result['insert_at']); 
        echo date('Y.m.d', strtotime($Date));
    ?>
</div>
<p><?php echo nl2br(htmlspecialchars($result['article_kj'],ENT_QUOTES,"UTF-8")); ?></p>
</body>
</html>