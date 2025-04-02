<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>class1</title>
</head>
<?php

class Dress 
{
    public $name;
    public $material;
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

print $ruby->name;
print $ruby->material;
print "<br>";
print $opal->name;
print $opal->material;
print "<br>";
print $topaz->name;
print $topaz->material;
print "<br>";
?>