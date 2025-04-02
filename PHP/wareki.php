<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>西暦から和暦変換</title>
</head>
<body>
<?php
$name=$_REQUEST['seiriki'];
print "西暦 $name 年は";
if($name < 1868){
    print "明治以前です";
}elseif($name >= 1868 && $name <=1911){
    print "明治".($name - 1867)."年です<br>";
}elseif($name >= 1912 && $name <=1925){
    print "大正".($name - 1911)."年です<br>";
}elseif($name >= 1926 && $name <=1988){
    print "昭和".($name - 1925)."年です<br>";
}elseif($name >= 1989 && $name <=2018){
    print "平成".($name - 1988)."年です<br>";
}else{
    print "令和".($name - 2018)."年です<br>";
}
?>