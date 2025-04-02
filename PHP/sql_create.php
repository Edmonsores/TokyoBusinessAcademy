<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<?php
$db=new SQLite3("db_ehon");
$query="CREATE TABLE tbl_ehon(id INTENGER, title VARCHAR(10),price INTENGER)";
$re=$db->exec($query);
print("[db_ehon]をさくせいしました");
$db->close();
?>
</body>
</html>