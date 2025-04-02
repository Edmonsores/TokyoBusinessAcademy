<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<?php
$db=new SQLite3("db_ehon");
$query="DELETE FROM tbl_ehon WHERE title='tcp/ipの絵本'";
$re=$db->query($query);

$query2="SELECT * FROM tbl_ehon";
$re2=$db->query($query2);
while($info = $re->fetchArray(SQLITE3_ASSOC)){
    print "id = {$info['id']},";
    print "title = {$info['title']},";
    print "price = {$info['price']},";
    print "<br>\n";
}
$db->close();
?>
</body>
</html>