<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>match</title>
</head>
<?php
preg_match("/[A-Z]{3}/","Let's study PHP!", $s);
foreach($s as $i){
    print $i;
}
print "<br>";

preg_match("/^[a-z]/i","Let's study PHP!", $s);
foreach($s as $i){
    print $i;
}
print "<br>";

$strs = "171-002";
if(preg_match ("/^([0-9]{3})-([0-9]{4})$/",$strs)){
    print "正しい郵便番号。";
} else{
    print "形式がありません。";
}
print "<br>";

$str = "There is no pen. I want a pencil.";
$str2 = preg_replace("/pen/", "pencil", $str);
print "$str2<br>";
$str2 = preg_replace("/pen(cil)?/", "pencil", $str);
print "$str2";
?>
</html>