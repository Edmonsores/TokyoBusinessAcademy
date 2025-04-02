<?php
$num=1000;
print "$num は";
if(0<=$num && $num<=9){
    print "１桁の数です<br>";
}elseif(10<=$num && $num<=99){
    print "２桁の数です<br>";
}elseif(100<=$num && $num<=999){
    print "３桁の数です<br>";
}else{
    print "４桁の数です<br>";
}
?>