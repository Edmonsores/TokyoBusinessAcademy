<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $kno = $_POST['kno'];
    $name = $_POST['name'];
    $jyusyo = $_POST['jyusyo'];
    $tiiki = $_POST['tiiki'];
    $tanka = $_POST['tanka'];
    $tai = $_POST['tai'];
    $giftbox = isset($_POST['giftbox']) ? 1 : 0;
    $ribbon = isset($_POST['ribbon']) ? 1 : 0;

    $tanka = str_replace('円', '', $tanka);
    $tanka = str_replace(',', '', $tanka); 
    
    echo "<p>内容を確認して<br>
    ご購入の際は「お買い物が定します」ボタンを<br>クリックしてください</p>";
    echo "<table border='1'>";
    echo "<tr><td>会員NO</td><td>$kno</td></tr>";
    echo "<tr><td>お名前</td><td>$name</td></tr>";
    echo "<tr><td>住所</td><td>$jyusyo</td></tr>";
    echo "<tr><td>地域</td><td>$tiiki</td></tr>";
    echo "<tr><td>単価</td><td>$tanka</td></tr>";
    echo "<tr><td>個数</td><td>$tai</td></tr>";
    echo "<tr><td>ギフトボックス</td><td>$giftbox</td></tr>";
    echo "<tr><td>リボン</td><td>$ribbon</td></tr>";
    echo "</table>";

    echo "<form action='bear3_v2.php' method='post'>";
    
    echo "<input type='hidden' name='kno' value='$kno'>";
    echo "<input type='hidden' name='name' value='$name'>";
    echo "<input type='hidden' name='jyusyo' value='$jyusyo'>";
    echo "<input type='hidden' name='tiiki' value='$tiiki'>";
    echo "<input type='hidden' name='tanka' value='$tanka'>";
    echo "<input type='hidden' name='tai' value='$tai'><br>";
    echo "<input type='hidden' name='giftbox' value='$giftbox'>";
    echo "<input type='hidden' name='ribbon' value='$ribbon'>";
    echo "<input type='submit' value ='お買い物が決定します'>";
    echo "</form>";
}
?>