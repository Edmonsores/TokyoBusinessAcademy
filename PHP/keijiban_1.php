<?php
date_default_timezone_set('Asia/Tokyo'); // Tokyo時間に設定

// keijiban_1.txt が存在する場合
if (file_exists("keijiban_1.txt")) {
    $f = file("keijiban_1.txt"); // ファイルを配列に読み込む
    $ln = explode(",", $f[0]); // データをカンマで分割し最初のデータ(No)を取得
    $no = sprintf("%03d", $ln[0] + 1); // No に1を足して3桁に成型
} else { // keijiban_1.txt が存在しない場合
    $f = array(); // データ配列を作成
    $no = "001"; // Noは001から開始
}

if ($_SERVER["REQUEST_METHOD"] == "POST") { // ボタンが押されたとき
    $errMsg = ''; // エラーメッセージ初期化

    if (!$_POST['name']) { // 名前未入力チェック
        $errMsg = '名前を入力してください<BR>';
    } elseif (!$_POST['free']) { // 記事未入力チェック
        $errMsg = '記事を入力してください';
    }

    if (!$errMsg) { // エラーメッセージがない場合
        $free = preg_replace("/\n/", "<BR>", $_POST['free']); // 改行コードを<br>に置き換え
        $time = date("Y/m/d H:i:s"); // 現在の日時を取得
        $data = array($no, $_POST['name'], $free, $time); // No, 名前, メッセージ, 時間を配列に
        $datag = implode(",", $data); // 配列をカンマ区切りで文字列に変換
        array_unshift($f, $datag . "\n"); // 配列$fの先頭にデータを追加

        $file = fopen("keijiban_1.txt", "w"); // 書き込み用でファイルを開く
        foreach ($f as $line) {
            fputs($file, $line); // ファイルに書き込み
        }
        fclose($file); // ファイルを閉じる
        header("Location:keijiban_1.php"); // リロード時の再投稿を防ぐ
        exit; // 終了
    }
}
?>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>掲示板</title>
</head>
<body>
<form method="post" action="keijiban_1.php"> <!-- 自分自身を読み込む -->
<h1>掲示板</h1>
<?php
if (@$errMsg) { // エラーメッセージがある場合
    echo "<span style='color:red'>" . @$errMsg . "</span>";
}
?>
<table border="1">
<tr>
    <td>名前:
    <input type="text" name="name" size="27">記事<br>
    <textarea name="free" cols="60" rows="8"></textarea><br><br>
    <input type="submit" name="submit" value="書き込む">
    <input type="reset" value="取り消す">
    </td>
</tr>
</table>
<br><hr><br>
<?php
foreach ($f as $line) { // ファイルから一行ずつ読み込み
    list($no, $name, $free, $time) = explode(",", $line); // カンマで分割し変数に代入
    print "<table border='1' width='500'><tr>";
    echo "<th>[No." . $no . "] 名前: " . $name . "</th>"; // Noと名前を表示
    echo "<th>書込み日付: " . $time . "</th>"; // 日時表示
    echo "</tr><tr>";
    echo "<td align='left' colspan='2'>" . $free . "</td>"; // 記事表示
    echo "</tr></table><br>";
}
?>
</form>
</body>
</html>
