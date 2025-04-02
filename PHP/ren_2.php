<?php
$tarou = array(
    'eigo' => 90,
    'kokugo' => 85,
    'sugaku' => 70
);
echo "①<br>";
echo "太郎さんの英語の点数は{$tarou['eigo']}点です。<br>";
echo"太郎さんの国語の点数は{$tarou['kokugo']}点です。<br>";
echo"太郎さんの数学の点数は{$tarou['sugaku']}点です。<br>";
echo "<br>";

?>
<?php
$tarou = array(
    'eigo' => 90,
    'kokugo' => 85,
    'sugaku' => 70
);
$kamoku = array('eigo', 'kokugo', 'sugaku');
echo "②<br>";
echo "太郎さんの英語の点数は{$tarou[$kamoku[0]]}点です。<br>";
echo "太郎さんの国語の点数は{$tarou[$kamoku[1]]}点です。<br>";
echo "太郎さんの数学の点数は{$tarou[$kamoku[2]]}点です。<br>";
echo "<br>";
?>
<?php
$kuni = array('日本', '中国', 'イギリ', 'アメリカ', 'カナダ');
$syuto = array('東京', '北京', 'ロンドン', 'ワシントン', 'オタフ');

$world = array(
    'kuni' => $kuni,
    'syuto' => $syuto
);
echo "③<br>";
echo $world['kuni'][0] . "の首都は " . $world['syuto'][0] . "です。<br>";
echo $world['kuni'][1] . "の首都は " . $world['syuto'][1] . "です。<br>";
echo $world['kuni'][2] . "の首都は " . $world['syuto'][2] . "です。<br>";
echo $world['kuni'][3] . "合衆国の首都は " . $world['syuto'][3] . "です。<br>";
echo $world['kuni'][4] . "の首都は " . $world['syuto'][4] . "です。<br>";

?>