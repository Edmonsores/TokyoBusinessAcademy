<?php
if (file_exists('counter.txt')) {
    $file=@fopen("counter.txt", "r") or die("file Error");
    $counter = 0;
    while (!feof($file)) {
        $counter = fgets($file);
    }
    fclose($file);
    $counter++;
}
$file = fopen('counter.txt', 'w');
flock($file,LOCK_EX);
fputs($file, $counter);
flock($file,LOCK_UN);
fclose($file);
print "あなたは・・・ {$counter}番目の訪問者です";
?>
