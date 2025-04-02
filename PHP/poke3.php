<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>自分のポケモンを選択してください<br>
    <form action="<?php $_SERVER["PHP_SELF"]?>" METHOD="POST" name="form1">
        <input type="radio" name="0" value="1">ピカチュウ
        <input type="radio" name="0" value="2">ワシギダネ
        <input type="radio" name="0" value="3">ゼニガメ
    <p>
        <input type="submit" name="sub1" value="進化">
    </p>
    </p>
    </form>
<?php
class pokemon
    {
        public $name1;
        public $name2;
        public function printname()
        {
            print "おめでとう　".$this->name1."　は　".$this->material."　に進化しました<br>";
        }
        public function __construct($n1,$n2){
            $this->name=$n1;
            $this->material=$n2;
        }
    }

class pokemon2 extends pokemon
    {
        public $type;
        public function printtype()
        {
            print "おめでとう　".$this->type."　タイプの　".$this->name1."　は　".$this->name2."　に進化しました<br>";
        }
        public function __construct($n1,$n2,$t){
            $this->name1=$n1;
            $this->name2=$n1;
            $this->type=$t;
        }
    }
class pokemon3 extends pokemon2
    {
        public $level;
        public function printlevel()
        {
            if($_SERVER["REQUEST_METHOD"]=="POST"){
                $b = isset($_POST['0'])?$_POST['0']:0;
                if($b==1){
                    $fp=@fopen("plevel.txt","r") or die("File Open Error!|n");
                    while(!feof($fp)){
                        $line =fgets($fp);
                        }
                    fclose($fp);
                    if($line>=15){
                        print  $this->name1."のレベルは".$this->level."以上です。<br>";
                        print  $this->name1."は進化できます。<br>";
                        print "おめでとう　".$this->type."　タイプの　".$this->name1."　は　".$this->name2."　に進化しました<br>"; 
                    }else{
                        print  $this->name1."のレベルは".$line."です。<br>";
                        print  $this->name1."は進化できません。<br>";
                    }
                }
                if($b==2){
                    $fp=@fopen("flevel.txt","r") or die("File Open Error!|n");
                    while(!feof($fp)){
                    $line =fgets($fp);
                    }
                    fclose($fp);
                    if($line>=16){
                        print  $this->name1."のレベルは".$this->level."以上です。<br>";
                        print  $this->name1."は進化できます。<br>";
                        print "おめでとう　".$this->type."　タイプの　".$this->name1."　は　".$this->name2."　に進化しました<br>"; 
                    }else{
                        print  $this->name1."のレベルは".$line."です。<br>";
                        print  $this->name1."は進化できません。<br>";
                    }
                }
                if($b==3){
                    $fp=@fopen("zlevel.txt","r") or die("File Open Error!|n");
                    while(!feof($fp)){
                        $line =fgets($fp);
                        }
                    fclose($fp);
                    if($line>=16){
                        print  $this->name1."のレベルは".$this->level."以上です。<br>";
                        print  $this->name1."は進化できます。<br>";
                        print "おめでとう　".$this->type."　タイプの　".$this->name1."　は　".$this->name2."　に進化しました<br>"; 
                    }else{
                        print  $this->name1."のレベルは".$line."です。<br>";
                        print  $this->name1."は進化できません。<br>";
                    }
                }
            }
        }
        public function __construct($n1,$n2,$t,$l){
            $this->name1=$n1;
            $this->name2=$n1;
            $this->type=$t;
            $this->level=$l;
        }
    }
    $p =new pokemon3("ピカチュウ","ライチュウ","電気","15");
    $k =new pokemon3("ワシギダネ","ワシギバナ","くさ、どく","16");
    $j =new pokemon3("ゼニガメ","カメックス","みず","16");
    if($_SERVER["REQUEST_METHOD"]=="POST")
    {
        $b = isset($_POST['0'])?$_POST['0']:0;
        if($b == 0){
            echo "あなたのポケモンは未設定\n<br>";
        }elseif($b == 1){
            $p->printlevel();
        }elseif($b == 2){
            $k->printlevel();
        } elseif($b == 3){
            $j->printlevel();
        }
    }
?>
</body>
</html>

