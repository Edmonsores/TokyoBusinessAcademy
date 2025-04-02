<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>西暦から和暦変換</title>
</head>
<body>
<?php
function wareki($year, $subtractYear) {
    return $year - $subtractYear;
}
$seiriki = $_POST['seiriki'];

print "西暦 $seiriki 年は ";

if ($seiriki < 1868) {
    print "明治以前です";
} elseif ($seiriki >= 1868 && $seiriki <= 1911) {
    print "明治" . wareki($seiriki, 1867) . "年です<br>";
} elseif ($seiriki >= 1912 && $seiriki <= 1925) {
    print "大正" . wareki($seiriki, 1911) . "年です<br>";
} elseif ($seiriki >= 1926 && $seiriki <= 1988) {
    print "昭和" . wareki($seiriki, 1925) . "年です<br>";
} elseif ($seiriki >= 1989 && $seiriki <= 2018) {
    print "平成" . wareki($seiriki, 1988) . "年です<br>";
} else {
    print "令和" . wareki($seiriki, 2018) . "年です<br>";
}
?>
</body>
</html>