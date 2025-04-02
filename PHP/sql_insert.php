<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<?php
$db=new SQLite3("db_ehon");
$query="INSERT INTO tbl_ehon(id,title,price)VALUES(1,'cの絵本',1380)";
$re=$db->exec($query);

$query="INSERT INTO tbl_ehon(id,title,price)VALUES(2,'tcp/ipの絵本',1580)";
$re=$db->exec($query);

$query="INSERT INTO tbl_ehon(id,title,price)VALUES(3,'SQLの絵本',1680)";
$re=$db->exec($query);

$query="INSERT INTO tbl_ehon(id,title,price)VALUES(4,'perlの絵本',1680)";
$re=$db->exec($query);

print("[db_ehon]にデータを登録しました");
$db->close();
?>
</body>
</html>