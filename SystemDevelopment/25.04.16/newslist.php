<?php

//データベース接続情報を格納
include("config.php");

try{

    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $sql = "select"
            ." nt.seq_no"
            .",nt.title_kj"
            .",nt.insert_at"
            ." from s24083030_news_tbl nt"
            ." where nt.delete_ku = '0'"
            ." order by nt.seq_no desc"
            .";";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

    $count = $stmt->rowCount();
    while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
        $data[] = $row;
    }

}catch (PDOException $e){
    echo($e->getMessage());
    die();
}

?>

<html>
<body>
<h1>ニュース一覧</h1>
<table border=1>
    <tr><th>id</th><th>日付</th><th>タイトル</th></tr>
    <?php foreach($data as $row): ?>
    <tr>
        <td><?php echo $row['seq_no'];?></td>
        <td>
            <?php
                $Date = date($row['insert_at']); 
                echo date('Y.m.d', strtotime($Date));
            ?> 
        </td>
        <td><a href="newsArticle.php?seq_no=<?php echo $row['seq_no'];?>"><?php echo $row['title_kj'];?></a></td>
     </tr>
    <?php endforeach; ?>
</table>
</body>
</html>