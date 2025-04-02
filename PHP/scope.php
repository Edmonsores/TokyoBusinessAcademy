<body>
<?php
$x = 2; $y = 2;
function funcscope(){
    $x = 0;
    global $y;
    static $z;
    $x++; $y++; $z++;
    print "\$x=$x, \$y=$y, \$z=$z";
    print "<br>\n";
}
funcscope();
funcscope();
print "\$x=$x, \$y=$y";
?>
</body>