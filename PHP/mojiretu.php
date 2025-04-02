<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>match</title>
</head>
<body>
<?php

$str = "Attention!";
print "str = $str<br>";
$new_str = strtolower($str);
print "小文字 = $new_str<br>";
$new_str = strtoupper($str);
print "大文字 = $new_str<br>";

$str = " I'm fine.\n";
print "str = $str<br>";
$clean_str = trim($str);
print "空白をとる = $clean_str<br>";

$str2 = "fine|cloudy|rainy";
$array = explode("|", $str2);
$str2 = implode(", ", $array);
print ",で結合 = $str2<br>";

$val1 = 123.4;
$val2 = sprintf("%03d", $val1);
echo "%d は = $val2<br>";
$val3 = sprintf("%5.6f", $val1);
echo "%f は = $val3<br>";
$val4 = sprintf("%s", $val1);
echo "%s は = $val4<br>";

$str = "PHPの絵本";
$length1 = strlen($str);
print "strlen= $length1 文字<br>";

$length2 = mb_strlen($str);
print "mb_strlen= $length2 文字<br>";

$place = strpos("Hello World", "o", 2);
echo "先頭から数えて $place 番目<br>";

$str = substr("Hello World", 0, 7);
echo "substrで0番目から7文字 = $str<br>";

$hizuke = "2021-12-21";
list($y, $m, $d) = explode("-", $hizuke);
echo "y= $y<br>m= $m<br>d= $d<br>";
?>
</body>
