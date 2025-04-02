<?php
if($_SERVER["REQUEST_METHOD"]=="POST"){
    foreach($_SERVER as $key=>$value){
        echo "<b>$key:</b>$value<br>";
    }
}
?>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>server</title>
</head>
<body>
    確認ボタンを押して$_SERVERの内容を表示してみましょう<br>
<form action="<?php $_SERVER["PHP_SELF"]?>"METHOD="POST" name="form1">
<input type="submit" name="sub1" value="確認">
</form>
</body>
</html>