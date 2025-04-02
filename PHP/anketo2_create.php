<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<?php
$db=new SQLite3("db_ank2");
$query="CREATE TABLE tbl_ank2(ans1 INTEGER, ans2 INTEGER)";
$re=$db->exec($query);
print("[db_ank2]をさくせいしました");
$db->close();
?>
</body>
</html>