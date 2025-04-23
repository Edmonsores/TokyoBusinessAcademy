
<?php

//データベース接続情報を格納
include("config.php");

$dbh = new PDO($dsn, $user, $password);
$dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTデータの取得
    $hid_seq_no = $_POST['hid_student_no']; //削除される対象のseq_no

    if($hid_student_no !== ""){

        //UPDATE文（更新）
        $sql = "update student_mst_ai set"
        ." delete_ku = '1'"
        ." where student_no = :student_no;";

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':student_no', $hid_seq_no, PDO::PARAM_INT);
            $stmt->execute();
        }catch (PDOException $e){
            echo($e->getMessage());
            die();
        }
    }
}

try{
    
    $sql = "select"
            ." sm.student_no"
            .",sm.student_kj"
            .",sm.student_kn"
            .",sm.student_cd"
            .",gm.gakka_no"
            .",gm.gakka_kj"
            .",sm.update_at"
            ." from student_mst_ai sm"
            ." inner join gakka_mst gm"
            ." on sm.gakka_no = gm.gakka_no"
            ." where sm.delete_ku = '0'"
            ." and gm.delete_ku = '0'"
            ." order by sm.update_at desc;";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

    $count = $stmt->rowCount();
    while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
        $data[] = $row;
    }

}catch (PDOException $e){
    echo($e->getMessage());
    die();
}


?>
<html>
    <haed>
        <script type="text/javascript">

        document.getElementById('hid_student_no').value = "";

        function MJ_UPD(argSEQ_NO){
            document.location.href="dataUpd.php?student_no="+argSEQ_NO;
        }
        function MJ_DEL(argSEQ_NO){
            document.getElementById('hid_student_no').value = argSEQ_NO;
            document.fr01.submit();
        }
        </script>
    </head>
<body>
    <div style="text-align: center;margin-top:20px;margin-bottom:20px;">データ管理</div>
    <div style="margin-top:10px;margin-bottom:10px;">
        <a href="dataAdd.php">新規登録</a>
    </div>
    <form name="fr01" action="" method="POST">
        <input type="hidden" id="hid_student_no" name="hid_student_no" value="">
        <table border="1" style="font-size:11px;" width="100%">
            <tr>
                <th>生徒NO</th>
                <th>生徒名</th>
                <th>生徒名カナ</th>
                <th>学籍番号</th>
                <th>学科NO</th>
                <th>学科名</th>
                <th>日付</th>
                <th>機能</th>
            </tr>
            <?php foreach($data as $row): ?>
                <tr>
                <td><?php echo $row['student_no'];?></td>
                <td><?php echo $row['student_kj'];?></td>
                <td><?php echo $row['student_kn'];?></td>
                <td><?php echo $row['student_cd'];?></td>
                <td><?php echo $row['gakka_no'];?></td>
                <td><?php echo $row['gakka_kj'];?></td>
                <td><?php echo $row['update_at'];?></td>
                <td>＜<a href="javascript:" onclick="MJ_UPD(<?php echo $row['student_no']; ?>);">更新</a>＞｜＜<a href="javascript:" onclick="MJ_DEL(<?php echo $row['student_no']; ?>);">削除</a>＞</td>
                </tr>
            <?php endforeach; ?>
        </table>
    </form>
</body>
</html>