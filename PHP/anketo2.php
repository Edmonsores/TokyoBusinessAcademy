<!DOCTYPE html>
 <html lang="ja">
 <head> 
<meta charset="UTF-8"/>
<title>アンケート</title> 
</head> 
<body> 
<h1>アンケート結果</h1> 
<p> 
<?php 
$toi1 = $_POST['ans1']; 
$toi2 = $_POST['ans2'];

$db2=new SQLite3("db_ank2");

$query2="INSERT INTO tbl_ank2(ans1,ans2)VALUES($toi1,$toi2)"; 
$re=$db2->exec($query2); 

print "問1 見学理由 (0有名だから、 1家から近いから、 2興味があったから、 3尊敬する人がいるから、 4その他) <br>"; 
print "問2 性別 (1男性、 2女性)<br><br>"; 
print "問1,問2<br>"; 

$a_toi1=array("有名だから","近いから","興味があったらから","尊敬する人がいるから","その他"); 
$a_toi2=array("男性","女性"); 
$kei1=array(0,0,0,0,0);
$kei2=array(0,0);

$query="SELECT * FROM tbl_ank2"; 
$re=$db2->query($query);
 while($info = $re->fetchArray(SQLITE3_ASSOC)){ 
$i=$info['ans1'] ; 
$kei1[$i]+=1;

$j=$info['ans2']; 
$kei2[$j]+=1;
print "$a_toi1[$i],"; 
print "$a_toi2[$j],"; 
print "<br>\n"; 
 }
$db2->close(); 
print "<集計> 見学理由 <br>"; 
for($z=0;$z<5;$z++){ 
print "$a_toi1[$z]=$kei1[$z],"; 
print "<br>\n"; 
}
print "<性別> 見学理由 <br>"; 
for($z=0;$z<2;$z++){
print "$a_toi2[$z]=$kei2[$z],"; 
print "<br>\n";
}
?>
</p>
</body>
</html>