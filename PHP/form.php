<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>受付確認画面</title>
</head>
<body>
<h1>受付確認画面</h1>
<p>
<?php
    print "お名前: ";
	print ($_POST['namae']);
?>
</p>
<p>
<?php
    print "商品のお送りせ: ";
    print ($_POST['yuubinbango']);
    print "\n";
    print ($_POST['juusho']);
?>
</p>
<p>
<?php
    print "性別: ";
    print ($_POST['first']);
?>
</p>
<p>
<?php
    print "ご請求方法:  ";
    print ($_POST['kind']);
?>
</p>
<p>
    以上の内容で商品を受付けました。<br>
    ありがとうございました。
</p>
<?php
    print " ひみつに年齢をもらいました{$_POST['a']}歳ですね。";
?>
</body>
</html>