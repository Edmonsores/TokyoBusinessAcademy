<?php
$ans1 = $_POST["ans1"];
$ans2 = $_POST["ans2"];

$db = new SQLite3('db_ank');

$query = "INSERT INTO tbl_anketo (ans1, ans2) VALUES ('$ans1', '$ans2')";
$re=$db->exec($query);

$query="SELECT * FROM tbl_anketo";
$re=$db->query($query);

echo "<h2>アンケート結果</h2>";
echo "問1 見学理由 (0有名だから, 1家から近いから, 2興味があったらから, 3尊敬する人がいるから, 4その他)";
echo "<br>問2 性別 (0男性, 1女性)";
echo "<table>";
echo "<tr><th>問1</th><th>問2</th></tr>";

while ($row = $re->fetchArray(SQLITE3_ASSOC)) {
  echo "<tr>";
  echo "<td>" . $row['ans1'] . "</td>";
  echo "<td>" . $row['ans2'] . "</td>";
  echo "</tr>";
}

echo "</table>";

?>