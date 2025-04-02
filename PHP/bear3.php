<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $kno = $_POST['kno'];
    $name = $_POST['name'];
    $jyusyo = $_POST['jyusyo'];
    $tiiki = $_POST['tiiki'];
    $tai = $_POST['tai'];
    $tanka=10000;

    $data = "$kno,$name,$jyusyo,$tiiki,$tai\n";

    $name = 'bear.txt';
    if (file_exists($name)) {
        $fh = fopen($name, 'a');
    } else {
        $fh = fopen($name, 'w');
    }
    fputs($fh, $data);
    fclose($fh);

    echo "<p>ご購入ありがとうございました</p>";
    echo "<p>ご購入された内容を確認されたい場合は確認をクリックしてください";
    echo "<a href='bear4.php?kno=$kno'>確認</a></p>";
}
?>