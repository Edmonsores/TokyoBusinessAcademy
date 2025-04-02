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

$fcounter = sprintf('%05d', $counter);
print 'アクセスカウンター<br>';
for ($i = 0; $i < strlen($fcounter); $i++) {
    $digit = substr($fcounter, $i, 1);
    print "<img src='Counter/$digit.png' alt='$digit' />";
}
print '<br>人目の訪問者です';
?>
