<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>偶数・奇数</title>
</head>
<body>
<?php
$a=$_REQUEST['number'];
if($a %2 == 0){
    print "$a は偶数です";
}else{
    print "$a は奇数です";
}
?>