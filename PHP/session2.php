<?php session_start();?>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>セッション管理</title>
</head>
<body>
<?php
$b = $_SESSION['bridge'];
print "ページ２のあたいは $b です。\n"
?>
<p><a href='session1.php'>ページ１へ</a></p>
</body>
</html>