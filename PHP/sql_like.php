<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<?php
$db=new SQLite3("db_ehon");
$query="SELECT title,price FROM tbl_ehon WHERE title LIKE '%C%'";
$re=$db->query($query);
while($info = $re->fetchArray(SQLITE3_ASSOC)){
    print "title = {$info['title']},";
    print "price = {$info['price']},";
print "<br>\n";
}
$db->close();
?>
</body>
</html>