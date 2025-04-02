<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>うるう年表示</title>
</head>
<?php
$u=0; $g=0;
$n=$_POST['year']; 
for ($i=1; $i<=10000;$i++) {
    if ($i>$n) {
        break;
    }
    if ($i % 400 == 0||($i % 4 == 0 && $i % 100 != 0)) {
        $u++;
        if($i % 400 == 0){
            print "<span style='color:red'>";
        }
        else{
            print "<span style='color:black'>";
         }
        print "$i ,";
        $g++;
        if ($g % 20 == 0) {
             print "<br>";
        }
    }
}
print "うろう年は $u 回です";
print "</body></html>"
?>
