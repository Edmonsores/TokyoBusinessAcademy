<?php

//データベース接続情報を格納
include("config.php");

if($_SERVER['REQUEST_METHOD'] === 'POST'){

    //POSTデータの取得
    $hid_seq_no = $_POST['hid_seq_no']; //削除される対象のseq_no

    if($hid_seq_no !== ""){

        //UPDATE文（更新）
        $sql = "update s24083030_news_tbl set"
        ." delete_ku = '1'"
        ." where seq_no = :seq_no;";
        $dbh = new PDO($dsn, $user, $password);
        $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        try{
            $stmt = $dbh->prepare($sql);
            $stmt->bindValue(':seq_no', $hid_seq_no, PDO::PARAM_INT);
            $stmt->execute();
        }catch (PDOException $e){
            echo($e->getMessage());
            die();
        }
    }
}
try{
    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    //一覧取得
    $sql = "select"
            ." nt.seq_no"
            .",nt.title_kj"
            .",nt.delete_ku"
            .",nt.insert_at"
            .",nt.update_at"
            ." from news_tbl nt"
            ." where nt.delete_ku = '0'" //削除されていないデータのみ表示
            ." order by nt.seq_no desc;";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

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

    document.getElementById('hid_seq_no').value = "";

    function MJ_UPD(argSEQ_NO){
        document.location.href="newsUpdate.php?seq_no="+argSEQ_NO;
    }
    function MJ_DEL(argSEQ_NO){
        document.getElementById('hid_seq_no').value = argSEQ_NO;
        document.fr01.submit();
    }

    </script>
<body>
    <div style="text-align: center;margin-top:20px;margin-bottom:20px;">ニュース管理</div>
    <div>
        <a href="newsAdd.php">新規登録</a>
    </div>
    <form name="fr01" action="" method="POST">
        <input type="hidden" id="hid_seq_no" name="hid_seq_no" value="">
        <table border="1" style="font-size:11px;" width="100%">
            <tr>
                <td>seq_no</td>
                <td>title_kj</td>
                <td>delete_ku</td>
                <td>insert_at</td>
                <td>update_at</td>
                <td>button</td>
            </tr>
            <?php foreach($data as $row): ?>
                <tr>
                    <td><?php echo $row['seq_no']; ?></td>
                    <td><?php echo $row['title_kj']; ?></td>
                    <td><?php echo $row['delete_ku']; ?></td>
                    <td><?php echo $row['insert_at']; ?></td>
                    <td><?php echo $row['update_at']; ?></td>
                    <td>＜<a href="javascript:" onclick="MJ_UPD(<?php echo $row['seq_no']; ?>);">更新</a>＞｜＜<a href="javascript:" onclick="MJ_DEL(<?php echo $row['seq_no']; ?>);">削除</a>＞</td>
                </tr>
            <?php endforeach; ?>
        </table>
    </form>
</body>
</html>
