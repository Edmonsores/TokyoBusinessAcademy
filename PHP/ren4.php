<?php
$aho = 0;
for ($i = 1; $i <= 20; $i++) {
    if ($i % 3 == 0) {
        print("あほ<br>");
        $aho++;
        continue;
    }
        if ($aho >= 5) {
            break;
        }
    if ($i % 8 == 0) {
        print("ワン<br>");
        continue; 
    }
    print($i ."<br>"); 
}
print("おもろー");
?>