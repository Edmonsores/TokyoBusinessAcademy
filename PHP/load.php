<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>upload</title>
</head>
<body>
<?php
if(move_uploaded_file(
    $_FILES['upfile']['tmp_name'],
    "./".$_FILES['upfile']['name']
) == FALSE){
    print "失敗しました。";
}else{
    print ($_FILES['upfile']['name']);
    print "をアップロードしました。";
}
?>
</body>
</html>