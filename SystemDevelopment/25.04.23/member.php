<?php
//データベース接続情報を格納
include("config.php");

try{

    $dbh = new PDO($dsn, $user, $password);
    $dbh->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $sql = "select"
            ." um.email"
            .",um.user_name"
            .",um.update_at"
            ." from users_mst um"
            ." where um.delete_at is null"
            ." order by um.user_id asc"
            .";";
    $stmt = $dbh->prepare($sql);
    $stmt->execute();

    $count = $stmt->rowCount();
    while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
        $data[] = $row;
    }

}catch (PDOException $e){
    echo($e->getMessage());
    die();
}
?>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <title>Responsive Web Design</title>
  <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0">
  <meta name="keywords" content="">
  <meta name="description" content="">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/index.css">
</head>
<body>
<!-- wrapper -->
<div class="wrapper">
  <!-- header -->
  <header>
      <!-- Global Navigation -->
      <nav class="header-box">
          <div id="header-box-mb">
              <div class="header-box-mb-left">
                  <input id="nav-input" type="checkbox" class="nav-unshown">
                  <label id="nav-open" for="nav-input"><span></span></label>
                  <label class="nav-unshown" id="nav-close" for="nav-input"></label>
                  <div id="nav-content">
                      <div class="hamburger-top"><label class="cancel" for="nav-input"><img src="img/menu-close48-48.png" alt="close" style="width:16px;height:auto;" ></label></div>
                      <div class="hamburger-border"></div>
                      <div class="header-box-mb-menu">
                          <div class="header-box-mb-menu-box">
                              <div class="header-box-mb-menu-category">運営管理者</div>
                              <div class="header-box-mb-menu-item"><a href="member.html">ユーザー管理</a></div>
                          </div>
                          <div class="header-box-mb-signin"><a href="">ログアウト</a></div>
                      </div>
                  </div>
              </div>
              <div class="header-box-mb-center">
                  <div class="header-box-mb-logo"><a href=""><img src="img/TSUNAGOON-Logo.png" alt="TSUNAGOON（ツナグーン）"></a></div>
              </div>
              <div class="header-box-mb-right">
              </div>
          </div>
          <div id="header-box-pc">
              <div class="header-box-pc-left">
                  <div class="header-box-pc-left-logo"><a href=""><img src="img/TSUNAGOON-Logo.png" alt="TSUNAGOON（ツナグーン）"></a></div>
              </div>
              <div class="header-box-pc-right">
                  <div class="header-box-pc-right-menu"><a href="">ログアウト</a></div>
              </div>
          </div>
      </nav>
  <!-- /Global Navigation -->

  </header>
  <!-- /header -->
    
  <!-- main -->
  <main>
      <!-- mypage-menu -->
      <div class="mypage-pc-menu">
          <div class="mypage-pc-menu-box">
              <div class="mypage-pc-menu-box-category">運営管理者</div>
              <ul>
                  <li><a href="member.html">ユーザー管理</a></li>
              </ul>
          </div>
      </div>
      <!-- /mypage-menu -->
      <!-- mypage-main -->
      <div class="mypage-main">
          <div class="mypage-main-midashi">ユーザー管理</div>
          <div class="mypage-main-text">

            <div class="mypage-main-text-button">
                <a href="" class="white-button">+ ユーザーを追加する</a>
            </div>
            <div class="mypage-main-text-grid">
                <table class="table-datalist">
                    <tbody>
                        <tr class="table-datalist-heading">
                            <th>メール</th>
                            <th>名前</th>
                            <th>更新日時</th>
                            <th></th>
                        </tr>
                        <?php foreach($data as $row): ?>
                        <tr>
                            <td class="table-datalist-h" data-label="メール"><?php echo $row['email'];?></td>
                            <td data-label="名前"><?php echo $row['user_name'];?></td>
                            <td data-label="更新日時"><?php $Date = date($row['update_at']); echo date('Y.m.d', strtotime($Date));?>
						    </td>
                            <td>
                                <a href="" class="white-button list-button">編集</a>
                            </td>
                        </tr>
                        <?php endforeach; ?>
                    </tbody>
                </table>
            </div>
        
          </div>
        
      </div>
      <!-- /mypage-main -->
  </main>
  <!-- /main -->
    
  <!-- footer -->
  <footer>
      <div class="footer-box">
          <div class="footer-box-dat">
              <div class="footer-box-dat-logo"><a href="/"><img src="img/TSUNAGOON-Logo.png" alt="TSUNAGOON（ツナグーン）"></a></div>
              <div class="footer-box-dat-copyright">
                  copyright ©2020 WELL FIELD corpolation. All rights reserved. 
              </div>                
          </div>
      
      </div>
    
  </footer>
  <!-- /footer -->

  <script src="js/script.js"></script>
<!-- /wrapper -->
</div>
</body>
</html>