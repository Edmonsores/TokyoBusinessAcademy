<?php
$te = isset($_POST['te']) ? $_POST['te'] : 0;
$teha = array("未設定", "グー", "チョキ", "パー");
$com = 0;
$mes = "これから";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $te = isset($_POST['te']) ? $_POST['te'] : 1;
    $com = rand(1, 3);
    if($te==$com){
        $mes="あいご";
    }
    if (($te == 1 && $com == 2) || ($te == 2 && $com == 3) || ($te == 3 && $com == 1)) {
        $mes = "あなたの勝ちです！";
    }if (($te == 1 && $com == 3) || ($te == 2 && $com == 1) || ($te == 3 && $com == 2)) {
        $mes = "あなたの負けです！";
    }
} else {
    echo "自分の手を選択してから勝負ボタンを押してください！";
}
?>

<!DOCTYPE html>
<html>
<head>
<title>janken</title>
</head>
<body>
<form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="POST" name="form1">
    <input type="radio" name="te" value="1">ぐー
    <input type="radio" name="te" value="2">チョキ
    <input type="radio" name="te" value="3">パー
    <input type="submit" name="sub1" value="勝負">
</form>
<?php
print ("あなたの手：" . $teha[$te] . "<br>");
print ("<br>コンピュータの手は".$teha[$com]);
print ("<br>勝敗は...".$mes);
?>
</body>
</html>