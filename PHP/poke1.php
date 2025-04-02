<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>poke1</title>
</head>
<?php
class Pokemon {
    public $name;
    public $evolution;

    public function __construct($name, $evolution) {
        $this->name = $name;
        $this->evolution = $evolution;
    }

    public function sinka() {
        print "おめでとう" . $this->name . "は" . $this->evolution . "に進化した<br>";
    }
}

class Pokemonstype extends Pokemon {
    public $type;
    public function __construct($name, $evolution, $type) {
        $this->name = $name;
        $this->evolution = $evolution;
        $this->type = $type;
    }

    public function sinkas() {
        print "おめでとう" . $this->type . "タイプの" . $this->name . "は" . $this->evolution . "に進化した<br>";
    }
}

$pikachu = new Pokemonstype("ピカチュウ", "ライチュウ", "でんき");
$fushigidane = new Pokemonstype("フシギダネ", "フシギソウ", "くさ");
$hitokage = new Pokemonstype("ヒトカゲ", "リザード", "ほのお");
$zenigame = new Pokemonstype("ゼニガメ", "カメール", "みず");

$pikachu->sinkas();
$fushigidane->sinkas();
$hitokage->sinkas();
$zenigame->sinkas();

?>