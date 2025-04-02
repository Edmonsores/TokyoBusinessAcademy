<?php
$te=isset($_POST['te'])? $_POST['te']:0;
$teha=array("未設定","ぐー","チョキ", "パー");
$com=0;
$mes="これから";
if($_SERVER["REQUEST_METHOD"]=="POST"){
    $te=isset($_POST['te'])?$_POST['te']:1;
    $com=mt_rand(1,3);
    if($te==$com){
        $mes="あいご";
    }
    if(($te==1 && $com==2)||($te==2 && $com==3)||($te==3 && $com==1)){
        $mes="あなたの勝ち";
        kati();
    }
    if(($te==1 && $com==3)||($te==2 && $com==1)||($te==3 && $com==2)){
        $mes="あなたの負け";
    }
}
else{
    echo"自分の手を選択してから勝負ボタンを押してください";
}
function kati(){
    try{
        if(!file_exists("jyan.txt")){
            throw new Exception("ファイル見つかりません");
        }
        $fh=fopen("jyan.txt","r");
        $count = fgets($fh);
        fclose($fh);
        $count++;
        print"あなたは{$count}勝です";
        $fp = fopen("jyan.txt","w");
        fputs($fp, $count);
        fclose($fp);
    }
    catch(Exception $e){
        print "キャッチされた例外: (".$e->getMessage().")<br>";
    }
}
?>
<html>
    <head>
        <title>jyanken2</title>
    </head>
    <body>
    <form action="<?php $_SERVER["PHP_SELF"]?>" method="POST" name="form1">
    <input type="radio" name="te" value="1">ぐー
    <input type="radio" name="te" value="2">チョキ
    <input type="radio" name="te" value="3">パー
    <p>
    <input type="submit" name="sub1" value="勝負">
    </form>
    <?php
    print ("あなたの手は".$teha[$te]);
    print ("<br>コンピューターの手は".$teha[$com]);
    print ("<br>勝負は...".$mes);
    ?>
    </body>
</html>