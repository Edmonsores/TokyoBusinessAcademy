<?php setcookie('val',100);?>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>クッキー</title>
</head>
<body>
<?php
$getval = isset($_COOKIE['val']) ? $_COOKIE['val'] : "(なし)";
print "ページ２の値は $getval です。\n"
?>
<p><a href='cookie1.php'>ページ１へ</a></p>
</body>
</html>