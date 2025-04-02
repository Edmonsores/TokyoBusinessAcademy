<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>日付を扱う</title>
</head>
<body>
<?php
    // Tokyo時間にする Set to Tokyo time
    date_default_timezone_set('Asia/Tokyo');
    // 曜日用配列
    $youbi = array("日", "月", "火", "水", "木", "金", "土");
    // 今日の年月日時分秒を表示 Display today's date, time, minute and second
    echo date("Y/m/d H:i:s <br>");
    echo "<br>";
    // 年月日をそれぞれ取得 Get the date and time
    $y = date("Y");
    $m = date("m");
    $d = date("d");
    $w = date("w");
    // 5日後の年月日設定 Set the date 5 days later
    $after_5day = mktime(0, 0, 0, $m, $d + 5, $y);
    echo date("Y年m月d日", $after_5day);
    echo "<br>";
    // 先月の最終の日曜日 Last Sunday of last month
    echo date("Y年m月d日", mktime(0, 0, 0, $m, 0, $y));
    echo "<br>本日は" . $youbi[$w] . "曜日<br>";
?>
</body>
</html>
