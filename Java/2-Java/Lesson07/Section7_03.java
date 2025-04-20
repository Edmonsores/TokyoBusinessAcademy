
import java.util.Scanner;

public class Section7_03 {

    // 商品番号の4桁目に応じて分類名を返すメソッド
    public static String bunnyafun(int syono) {
        // 商品番号の4桁目を取得
        int lastDigit = syono / 1000;

        // 4桁目に応じた分類名を返す
        switch (lastDigit) {
            case 1:
                return "電気製品";
            case 2:
                return "日用雑貨";
            case 3:
                return "食品";
            case 4:
                return "衣類";
            default:
                return "分類不明";  // 通常は発生しない
        }
    }

    // メイン処理
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int syono = 0;

        // 商品番号の入力チェック
        while (true) {
            System.out.print("商品番号を入力してください (1000～4999): ");
            if (scanner.hasNextInt()) {
                syono = scanner.nextInt();
                if (syono >= 1000 && syono <= 4999) {
                    break;  // 正しい範囲ならループを抜ける
                } else {
                    System.out.println("商品番号は1000から4999の間で入力してください。");
                }
            } else {
                System.out.println("無効な入力です。数字を入力してください。");
                scanner.next(); // 無効な入力をスキップ
            }
        }

        // bunnyafunメソッドを呼び出して結果を表示
        String category = bunnyafun(syono);
        System.out.println("商品番号 " + syono + " は「" + category + "」に分類されます。");
        scanner.close();
    }
}
