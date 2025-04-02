<?php
if (isset($_GET['kno'])) {
    $kno = $_GET['kno'];
    $fname = 'bear.txt';

    if (file_exists($fname)) {
        $fh = fopen($fname, 'r');
        while ($line = fgets($fh)) {
            $parts = explode(',', $line);
            if ($parts[0] == $kno) {
                $name = $parts[1];
                $jyusyo = $parts[2];
                $tiiki = $parts[3];
                $tai = intval($parts[4]);
                if($tiiki == "関東・東北 800 円" ){
                    $haisou=800;
                }elseif($tiiki== "中部・北陸 1000 円"){
                    $haisou=1000;
                }elseif($tiiki== "関西.北海道 1500 円"){
                    $haisou=1500;
                }elseif($tiiki== "中国・四国・九州 2000 円"){
                    $haisou=2000;
                }
                $tanka = 10000;
                $goukei = $tai * $tanka + $haisou;

                echo "<table border='1'>";
                echo "<tr><td>会員NO</td><td>$kno</td></tr>";
                echo "<tr><td>お名前</td><td>$name</td></tr>";
                echo "<tr><td>住所</td><td>$jyusyo</td></tr>";
                echo "<tr><td>地域</td><td>$tiiki</td></tr>";
                echo "<tr><td>単価</td><td>$tanka</td></tr>";
                echo "<tr><td>個数</td><td>$tai</td></tr>";
                echo "<tr><td>合計</td><td>$goukei</td></tr>";
                echo "</table>";
                echo "<p>ご利用ありがとうございました。</p>";
                break;
            }
        }
        fclose($fh); 
    }
}
?>