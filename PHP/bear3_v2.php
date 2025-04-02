<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $kno = $_POST['kno'];
    $name = $_POST['name'];
    $jyusyo = $_POST['jyusyo'];
    $tiiki = $_POST['tiiki'];
    $tanka = $_POST['tanka'];
    $tai = (int) $_POST['tai'];
    $giftbox = isset($_POST['giftbox']) ? 1 : 0;
    $ribbon = isset($_POST['ribbon']) ? 1 : 0;

    $data = "$kno,$name,$jyusyo,$tiiki,$tanka,$tai,$giftbox,$ribbon\n";
    $fname = 'bear_v2.txt';
    
    if (file_exists($fname)) {
        $fh = fopen($fname, 'a');
    } else {
        $fh = fopen($fname, 'w');
    }
    fputs($fh, $data);
    fclose($fh);

    echo "<p>ご購入ありがとうございました</p>";
    echo "<p>ご購入された内容を確認されたい場合は確認をクリックしてください";
    echo "<a href='bear4_v2.php?kno=$kno'>確認</a></p>";
}
?>