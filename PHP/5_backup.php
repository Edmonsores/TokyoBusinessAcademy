<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>ファイルバックアップ</title>
</head>
<body>
    <form method="post" action="5_backup.php">
        <label for="filename">バックアップしたいファイルを拡張子を付けて入力し、ボタンをクリックしてください</label><br>
        <input type="text" name="filename" id="filename" required>
        <button type="submit">バックアップ</button>
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $filename = trim($_POST['filename']);
        if (strpos($filename, '.') !== false) {
            $dotPosition = strrpos($filename, '.');
            $fileBase = substr($filename, 0, $dotPosition);
            $backupFilename = $fileBase . '.bak';
            if (file_exists($filename)) {
                if (copy($filename, $backupFilename)) {
                    echo "<p>{$backupFilename}でバックアップしました</p>";
                } else {
                    echo "<p>エラー</p>";
                }
            } else {
                echo "<p>エラー</p>";
            }
        } else {
            echo "<p>エラー</p>";
        }
    }
    ?>
</body>
</html>
