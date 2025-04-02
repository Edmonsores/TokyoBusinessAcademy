<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>upload image</title>
</head>
<body>
    <h1>ファイル送信</h1>
<?php
if(move_uploaded_file(
    $_FILES['upfile']['tmp_name'],
    "./".$_FILES['upfile']['name']
) == FALSE){
    print "失敗しました。";
}else{
    print ($_FILES['upfile']['name']);
    print "アップロード成功";
    $upfilename = $_FILES['upfile']['name'];
    print "<img src='$upfilename'>";
}
?>
</body>
</html>