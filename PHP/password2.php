<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>パスワード入力確認画面</title>
</head>
<body>
<?php
$password = $_POST['pass'];
if(preg_match("/^[a-z][a-z0-9]{2,7}$/i", $password)){
    print "パスワードは正しい形式です。<br>\n";
}else{
    print "パスワードは正しい形式ではありません。<br>\n";
}
?>
</body>
</html>