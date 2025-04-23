<?php

//データベース接続情報を格納
include("config.php");

//変数初期宣言
$txt_student_kj = "";
$txt_student_kn = "";
$txt_student_cd = "";
$sel_gakka_no = "";
$rad_seibetu_ku = "0";
$txt_age_nb = "";
$txt_test_su = "";

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

//学科選択用のセレクトボックスを生成する1⃣
try{
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    //一覧取得
    $sql = "select"
            ." gm.gakka_no"
            .",gm.gakka_kj"
            ." from gakka_mst gm"
            ." where gm.delete_ku = '0'" //削除されていないデータのみ表示
            ." order by gm.gakka_no asc;";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

    while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
        $dataGakka[] = $row;
    }
}catch (PDOException $e){
    echo($e->getMessage());
    die();
}

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTデータの取得
    $txt_student_kj = $_POST['txt_student_kj'];
    $txt_student_kn = $_POST['txt_student_kn'];
    $txt_student_cd = $_POST['txt_student_cd'];
    $sel_gakka_no = $_POST['sel_gakka_no'];
    $rad_seibetu_ku = $_POST['rad_seibetu_ku'];
    $txt_age_nb = $_POST['txt_age_nb'];
    $txt_test_su = $_POST['txt_test_su'];

    $err = "";

    if($txt_student_kj == ""){
        $err .= "【生徒名】";
    }

    if($err == ""){

        $sql = "insert into student_mst_ai("
                ."student_kj"
                .",student_kn"
                .",student_cd"
                .",gakka_no"
                .",seibetu_ku"
                .",age_nb"
                .",test_su"
                .",delete_ku"
                .",insert_at"
                .",update_at"
                .") values ("
                .":student_kj"
                .",:student_kn"
                .",:student_cd"
                .",:gakka_no"
                .",:seibetu_ku"
                .",:age_nb"
                .",:test_su"
                .",'0'"
                .",now()"
                .",now()"
                .");";

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':student_kj', $txt_student_kj, PDO::PARAM_STR);
            $stmt->bindValue(':student_kn', $txt_student_kn, PDO::PARAM_STR);
            $stmt->bindValue(':student_cd', $txt_student_cd, PDO::PARAM_STR);
            $stmt->bindValue(':gakka_no', $sel_gakka_no, PDO::PARAM_INT);
            $stmt->bindValue(':seibetu_ku', $rad_seibetu_ku, PDO::PARAM_STR);
            $stmt->bindValue(':age_nb', $txt_age_nb, PDO::PARAM_INT);
            $stmt->bindValue(':test_su', $txt_test_su, PDO::PARAM_INT);
            $stmt->execute();

            header("Location:dataList.php");
        } catch(Exception $e){
            echo "データの書き込みに失敗しました。". $e->getMessage();
        }
    }else{
        echo $err."を修正してください。";
    }
}
?>

<html>
<body>

<div style="text-align: center;margin-top:20px;margin-bottom:20px;">データ登録</div>
<div style="margin-top:10px;margin-bottom:10px;"><a href="dataList.php">一覧へ戻る</a></div>
    
<form action="" method="POST">
    生徒名<br>
    <input type="text" name="txt_student_kj" value="<?php echo $txt_student_kj; ?>" /><br>
    生徒名カナ<br>
    <input type="text" name="txt_student_kn" value="<?php echo $txt_student_kn; ?>" /><br>
    学籍番号<br>
    <input type="text" name="txt_student_cd" value="<?php echo $txt_student_cd; ?>" /><br>
    学科<br>
    <select name="sel_gakka_no">
        <?php
        foreach($dataGakka as $row):
            $strSelected = "";
            if($sel_gakka_no == $row['gakka_no']){$strSelected = " selected";}
            echo "<option value=".$row['gakka_no'].$strSelected.">".$row['gakka_kj']."</option>";
        endforeach;
        ?>
    </select>
    <br>
    性別<br>
    <input type="radio" name="rad_seibetu_ku" value="0" <?php if($rad_seibetu_ku == "0"){echo "checked";} ?>/>男性
    <input type="radio" name="rad_seibetu_ku" value="1" <?php if($rad_seibetu_ku == "1"){echo "checked";} ?>/>女性<br>
    年齢<br>
    <input type="text" name="txt_age_nb" value="<?php echo $txt_age_nb; ?>" /><br>
    テスト点数<br>
    <input type="text" name="txt_test_su" value="<?php echo $txt_test_su; ?>" /><br>
    <input type="submit" value="登録">
</form>
</body>
</html>