<?php
	$a = "Hello World1<br>";
    $b = "Hello World2!";
    //ヒアドキュメントを使ったPHPコード
    print<<<EOD
      $a
      $b
    EOD;
?>