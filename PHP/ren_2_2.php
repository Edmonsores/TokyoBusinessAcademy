<?php
$tarou = array(
    '英語' => 90,
    '国語' => 85,
    '数学' => 70
);
echo "①<br>";
foreach ($tarou as $subject => $score) {
    echo "太郎さんの{$subject}の点数は{$score}点です。<br>";
}
echo "<br>";
?>
<?php
$tarou = array(
    '英語' => 90,
    '国語' => 85,
    '数学' => 70
);
$kamoku = array('英語', '国語', '数学');
echo "②<br>";
foreach ($kamoku as $subject) {
    echo "太郎さんの{$subject}の点数は{$tarou[$subject]}点です。<br>";
}
echo "<br>";
?>
<?php
$kuni = array('日本', '中国', 'イギリ', 'アメリカ合衆国', 'カナダ');
$syuto = array('東京', '北京', 'ロンドン', 'ワシントン', 'オタフ');

$world = array(
    'kuni' => $kuni,
    'syuto' => $syuto
);
echo "③<br>";
for ($i = 0; $i < count($world['kuni']); $i++) {
    echo $world['kuni'][$i] . "の首都は " . $world['syuto'][$i] . "です。<br>";
}
?>