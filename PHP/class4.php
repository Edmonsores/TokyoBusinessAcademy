<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>class4</title>
</head>
<?php
class Dress 
{
    public $name;
    public $material;
    public function printdata()
    {
        print $this->name."の素材は".$this->material."です<br>";
    }
    public function __construct($n,$m){
        $this->name=$n;
        $this->material=$m;
    }
}
class colordress extends Dress
{
    public $color;
    public function printmaterial()
    {
        print $this->name."の素材は".$this->material."で色は".$this->color."です<br>";  
    }
    public function __construct($n,$m,$c){
        $this->name=$n;
        $this->material=$m;
        $this->color=$c;
    }
}
$ruby = new colordress("ルビー","レイヨン","ワイン");
$opal = new colordress("オパール","ウール","むらさき");
$topaz = new colordress("トパーズ","シルク","ピンク");

$ruby->printmaterial();
$opal->printmaterial();
$topaz->printmaterial();
?>