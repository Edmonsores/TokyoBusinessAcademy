<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>受付画面</title>
</head>
<body>
<?php
    print "サーバーのドメイン名は{$_SERVER['HTTP_HOST']}です<br>";
    print "相対バスは{$_SERVER['SCRIPT_NAME']}です<br>";
?>
<form action="super2.php" method="POST">
<p>私の名前は
<input type="text" name="myname">
<input type="submit" value="確認">
</p>
</form>