<?php

$year = $_GET['year'];
$month = $_GET['month'];
$day = $_GET['day'];
$file = "{$year}_{$month}_{$day}.txt";
$schedule = "";
if (file_exists($file)) {
    $handle = fopen($file, "r");
    if ($handle) {
        $schedule = fread($handle, filesize($file));
        fclose($handle);
    }
}

echo "{$year}年 {$month}月 {$day}日のスケジュール";
echo "<form action='sch3.php' method='post'>";
echo "<textarea name='schedule'>$schedule</textarea><br>";
echo "<input type='hidden' name='year' value='$year'>";
echo "<input type='hidden' name='month' value='$month'>";
echo "<input type='hidden' name='day' value='$day'>";
echo "<input type='submit' value='スケジュール登録'>";
echo "</form>";
echo "<a href='sch1.php'>カレンダーに戻る</a>";
?>

<?php