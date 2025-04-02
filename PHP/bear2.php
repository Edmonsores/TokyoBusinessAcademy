<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $kno = $_POST['kno'];
    $name = $_POST['name'];
    $jyusyo = $_POST['jyusyo'];
    $tiiki = $_POST['tiiki'];
    $tai = $_POST['tai'];
    $tanka=10000;

    echo "<p>内容を確認して<br>
    ご購入の際は「お買い物が定します」ボタンを<br>クリックしてください</p>";
    echo "<table border='1'>";
    echo "<tr><td>会員NO</td><td>$kno</td></tr>";
    echo "<tr><td>お名前</td><td>$name</td></tr>";
    echo "<tr><td>住所</td><td>$jyusyo</td></tr>";
    echo "<tr><td>地域</td><td>$tiiki</td></tr>";
    echo "<tr><td>個数</td><td>$tai</td></tr>";
    echo "</table>";

    echo "<form action='bear3.php' method='post'>";
    echo "<input type='hidden' name='kno' value='$kno'>";
    echo "<input type='hidden' name='name' value='$name'>";
    echo "<input type='hidden' name='jyusyo' value='$jyusyo'>";
    echo "<input type='hidden' name='tiiki' value='$tiiki'>";
    echo "<input type='hidden' name='tai' value='$tai'><br>";
    echo "<input type='submit' value ='お買い物が決定します'>";
    echo "</form>";
}
?>