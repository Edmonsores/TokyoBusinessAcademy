<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>じゃんけんゲーム</title>
</head>
<body>

    <?php
    $playerHand = "未設定";
    $computerHand = "未設定";
    $result = "これから";
    $a=rand(0,2);
    $hands = array("ぐー", "チョキ", "パー");

    function jokenpo($player, $computer) {
        if ($player === $computer) {
            return "あいこ";
        }
        elseif (
            ($player == "ぐー" && $computer == "チョキ") || ($player == "チョキ" && $computer == "パー") || ($player == "パー" && $computer == "ぐー")
        ) {
            return "勝ち";
        }
        return "負け";
    }

    if ($_SERVER["REQUEST_METHOD"] === "POST") {
        if (isset($_POST["hand"])) {
            $playerHand = $_POST["hand"];
            $computerHand = $hands[$a];
            $result = jokenpo($playerHand, $computerHand);
        } else {
            echo "自分の手を選択してから 勝負ボタンを押してください";
        }
    }
    ?>

    <form method="post" action="<?php $_SERVER["PHP_SELF"]; ?>">
        <label>
            <input type="radio" name="hand" value="ぐー" <?php if ($playerHand == "ぐー") echo "checked"; ?>> ぐー
        </label>
        <label>
            <input type="radio" name="hand" value="チョキ" <?php if ($playerHand == "チョキ") echo "checked"; ?>> チョキ
        </label>
        <label>
            <input type="radio" name="hand" value="パー" <?php if ($playerHand == "パー") echo "checked"; ?>> パー
        </label>
        <br><br>
        <button type="submit">勝負</button>
    </form>
    <br>
    あなたの手は<?php echo $playerHand; ?><br>
    コンピューターの手は<?php echo $computerHand; ?><br>
    勝敗は<?php echo $result; ?>
</body>
</html>