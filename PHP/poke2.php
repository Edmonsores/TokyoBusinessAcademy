<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>poke2</title>
</head>
<body>

<form method="POST">
    <p>どのポケモンを進化させますか？</p>
    <input type="radio" name="pokemon" value="ピカチュウ" required> ピカチュウ
    <input type="radio" name="pokemon" value="フシギダネ"> フシギダネ
    <input type="radio" name="pokemon" value="ゼニガメ"> ゼニガメ
    <input type="radio" name="pokemon" value="ヒトカゲ"> ヒトカゲ
    <br><br>
    <input type="submit" value="進化">
</form>

<?php

class Pokemon {
    public $name;
    public $evolution;
    public $level;
    public $requiredLevel;

    public function __construct($name, $evolution, $level, $requiredLevel) {
        $this->name = $name;
        $this->evolution = $evolution;
        $this->level = $level;
        $this->requiredLevel = $requiredLevel;
    }

    public function canEvolve() {
        return $this->level >= $this->requiredLevel;
    }

    public function evolve() {
        if ($this->canEvolve()) {
            return $this->name . "のレベルは" . $this->level . "です<br>".$this->name . "は" . $this->evolution . "に進化した<br>おめでとう " . $this->type . "タイプの" . $this->name . "はレベル" . $this->level . "で" . $this->evolution . "に進化した<br>";
        } else {
            return $this->name . "のレベルは" . $this->level . "です<br>進化のレベルが足りません<br>";
        }
    }
}

class Pokemonstype extends Pokemon {
    public $type;

    public function __construct($name, $evolution, $level, $requiredLevel, $type) {
        $this->name = $name;
        $this->evolution = $evolution;
        $this->level = $level;
        $this->requiredLevel = $requiredLevel;
        $this->type = $type;
    }

    public function evolve() {
        if ($this->canEvolve()) {
            return $this->name . "のレベルは" . $this->level . "です<br>".$this->name . "は" . $this->evolution . "に進化した<br>おめでとう " . $this->type . "タイプの" . $this->name . "はレベル" . $this->level . "で" . $this->evolution . "に進化した<br>";
        } else {
            return $this->name . "のレベルは" . $this->level . "です<br>進化のレベルが足りません<br>";
        }
    }
}

$pokemonData = [
    "ピカチュウ" => ["evolution" => "ライチュウ", "type" => "でんき", "levelFile" => "plevel.txt", "requiredLevel" => 15],
    "フシギダネ" => ["evolution" => "フシギソウ", "type" => "くさ", "levelFile" => "flevel.txt", "requiredLevel" => 10],
    "ゼニガメ" => ["evolution" => "カメール", "type" => "みず", "levelFile" => "zlevel.txt", "requiredLevel" => 5],
    "ヒトカゲ" => ["evolution" => "リザード", "type" => "ほのお", "levelFile" => "hlevel.txt", "requiredLevel" => 4],
];


if ($_SERVER["REQUEST_METHOD"] === "POST" && isset($_POST["pokemon"])) {

    $selectedPokemon = $_POST["pokemon"];
    $data = $pokemonData[$selectedPokemon];
    $file = fopen($data["levelFile"], "r");
    if ($file) {
        $level = (int) fgets($file);
        fclose($file);
    }
    $pokemon = new Pokemonstype($selectedPokemon, $data["evolution"], $level, $data["requiredLevel"], $data["type"]);

    echo "<p>" . $pokemon->evolve() . "</p>";
}

?>

</body>
</html>

