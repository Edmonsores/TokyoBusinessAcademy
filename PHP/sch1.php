<?php
$year = isset($_POST['year']) ? (int)$_POST['year'] : date('Y');
$month = isset($_POST['month']) ? (int)$_POST['month'] : date('m');
$firstday_w = date("w", mktime(0, 0, 0, $month, 1, $year));
$lastday = date("d", mktime(0, 0, 0, $month + 1, 0, $year));
$lastday_w = date("w", mktime(0, 0, 0, $month, $lastday, $year));

echo "<b>{$year}年 {$month}月</b><br>";
echo "<table border='1'>";
echo "<tr><td>日</td><td>月</td><td>火</td><td>水</td><td>木</td><td>金</td><td>土</td></tr><tr>";

if ($firstday_w != 0) {
    for ($i = 0; $i < $firstday_w; $i++) {
        echo "<td>　</td>";
    }
}
for ($d = 1; $d <= $lastday; $d++) {
    $w = date("w", mktime(0, 0, 0, $month, $d, $year));
    $file = "{$year}_{$month}_{$d}.txt";
    $indicator = file_exists($file) ? " *" : "";

    echo "<td><a href='sch2.php?year=$year&month=$month&day=$d'>$d$indicator</a></td>";

    if ($w == 6) {
        echo "</tr><tr>";
    }
}
if ($lastday_w != 6) {
    for ($i = $lastday_w + 1; $i <= 6; $i++) {
        echo "<td>　</td>";
    }
}
echo "</tr></table>";
?>

<form method="POST" action="sch1.php">
    <input type="text" name="year" size="4">年
    <input type="text" name="month" size="2">月
    <input type="submit" value="カレンダー表示">
</form>
