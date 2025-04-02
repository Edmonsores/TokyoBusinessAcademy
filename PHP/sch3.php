<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $year = $_POST['year'];
    $month = $_POST['month'];
    $day = $_POST['day'];
    $schedule = $_POST['schedule'];
    $file = "{$year}_{$month}_{$day}.txt";
    
    if (empty($schedule)) {
        echo "スケジュールが入力されていません";
    } else {
        $handle = fopen($file, 'w');
        if ($handle) {
            fwrite($handle, $schedule);
            fclose($handle);    
            echo "{$year}年 {$month}月 {$day}日のスケジュールを登録しました";
        } else {
            echo "ファイルを開くことができませんでした";
        }
    }
    echo "<br><a href='sch1.php'>カレンダーに戻る</a>";
}
?>