<?php
$namae = $_POST['namae'];
$yuubinbango = $_POST['yuubinbango'];
$juusho = $_POST['juusho'];
$first = $_POST['first'];
$kind = $_POST['kind'];
$a = $_POST['a'];
$membership = $_POST['membership'];
$memberships = array("正会員", "期間会員", "一時会員");
$selectedMembership = $memberships[$membership];
?>
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
    print "会員種別:  ";
    print ($selectedMembership);
?>
</p>
<p>
<?php
    print "お名前: ";
	print  ($namae);
?>
</p>
<p>
<?php
    print "商品のお送りせ: ";
    print  ($yuubinbango);
    print "\n";
    print  ($juusho);
?>
</p>
<p>
<?php
    print "性別: ";
    print  ($first);
?>
</p>
<p>
<?php
    print "ご請求方法:  ";
    print  ($kind);
?>
</p>
<p>
    以上の内容で商品を受付けました。<br>
    ありがとうございました。
</p>
<?php
    print " ひみつに年齢をもらいました{$a}歳ですね。";
?>
</body>
</html>