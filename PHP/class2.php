<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>class2</title>
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
}

$ruby = new Dress;
$opal = new Dress;
$topaz = new Dress;

$ruby->name = "ルビー";
$ruby->material = "レイヨン";
$opal->name = "オパール";
$opal->material = "ウール";
$topaz->name = "トパーズ";
$topaz->material = "シルク";

$ruby->printdata();
?>