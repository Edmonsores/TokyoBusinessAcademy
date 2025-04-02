<?php
if (file_exists("write.txt")) {
    $fp=@fopen("write.txt", "r") or die("file Error");
    while (!feof($fp)) {
        print fgets($fp) . "<br>";
    }
    fclose($fp);
    print "file関数";
    $f = file("write.txt");
    foreach ($f as $value) {
        print "<br>" . $value;
    }
}
?>