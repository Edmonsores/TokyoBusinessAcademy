<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>送信ページ</h1>
        <h3>好きな色</h3>
        <p>あなたの好きな色</p>
        <ul>
            <?php
            $colors = $_POST['colors'];
            foreach($colors as $color){
                echo "<li>$color</li>";
            }
            ?>
        </ul>
        <?php
        $mes="";
        if(isset($_POST['midori'])){
            $mes.="緑";
        }
        if(isset($_POST['murasaki'])){
            $mes.="紫";
        }
        if(isset($_POST['siro'])){
            $mes.="白";
        }
        echo "さらに「{$mes}」です";
        ?>
    </body>
</html>
