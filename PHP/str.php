<?php
    $number = $_POST['number'];
    $digits = $_POST['digits'];

    $N = sprintf("%0" . $digits . "d", $number);

    echo "<div>";
    for ($i = 0; $i < strlen($N); $i++) {
        $digit = substr($N, $i, 1);
        echo "<img src='Counter/$digit.png' alt='$digit' />";
    }
    echo "</div>";