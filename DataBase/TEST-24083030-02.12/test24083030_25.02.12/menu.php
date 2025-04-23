<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>メニュー</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .menu-container {
            margin-top: 50px;
        }
        .menu-title {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .menu-list {
            list-style: none;
            padding: 0;
        }
        .menu-list li {
            margin: 10px 0;
        }
        .menu-list a {
            display: block;
            width: 200px;
            padding: 10px;
            text-decoration: none;
            background-color: #3498db;
            color: white;
            border-radius: 5px;
            transition: 0.3s;
            margin: auto;
        }
        .menu-list a:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="menu-container">
        <div class="menu-title">メニュー</div>
        <ul class="menu-list">
            <li><a href="bookList.php">本管理</a></li>
            <li><a href="customerList.php">顧客管理</a></li>
            <li><a href="receptList.php">領収書</a></li>
        </ul>
    </div>
</body>
</html>
