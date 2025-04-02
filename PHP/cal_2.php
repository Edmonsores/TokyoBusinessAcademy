<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>カレンダー</title>
</head>
<body>
<?php
if(@$_POST['year']&&@$_POST['month']){
    $y = $_POST['year'];
    $m = $_POST['month'];
}else{
    $y = date("Y");
    $m = date("m");
}
    $firstday_w = date("w",mktime(0,0,0,$m,1,$y));
    $lastday = date("d", mktime(0,0,0,$m+1,0,$y));
    $lastday_w = date("w", mktime(0,0,0,$m,$lastday,$y));
    echo "<b>" .$y ."年" .$m ."月</b><br>";
    echo "<table border=\"1\">\n";
    echo "<tr>\n";
    echo "<td>日</td>\n";
    echo "<td>月</td>\n";
    echo "<td>火</td>\n";
    echo "<td>水</td>\n";
    echo "<td>木</td>\n";
    echo "<td>金</td>\n";
    echo "<td>土</td>\n";
    echo "</tr>\n";
    
    echo "<tr>\n";
    for ($d = 1; $d<=$lastday; $d++) {
        $w = date("w", mktime(0,0,0,$m,$d,$y));
        if ($w==0 || $d==1){
            echo "<tr>";
            if ($firstday_w !=0 && $d==1){
                for($i=$firstday_w; $i>0; $i--){
                    echo "<td>　</td>\n";
                }
            }
        }
        echo "<td>$d</td>\n";
    }
    if($lastday_w !=6){
        for($i=6; $i>$lastday_w; $i--){
            echo "<td>　</td>\n";
        }
    }
    echo "</tr>\n";
    echo "</table>\n"; 
    ?>
   <form method="POST" action="cal_2.php">
    <input type="text" name="year" size="4">年
    <input type="text" name="month" size="4">月
    <input type="submit" value="カレンダー表示">
    </form>
    </body>
    </html>