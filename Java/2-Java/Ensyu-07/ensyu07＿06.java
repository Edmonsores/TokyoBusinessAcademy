
import java.util.Scanner;
public class ensyu07＿06 {
    public static String season(int month) {
        switch (month) {
            case 3: case 4: case 5:
                return "春";
            case 6: case 7: case 8:
                return "夏";
            case 9: case 10: case 11:
                return "秋";
            case 12: case 1: case 2:
                return "冬";
            default:
                return "不明";
        }
    }

    // メインメソッド
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;

        // エラーチェック付きで月の入力を受け付ける
        while (true) {
            System.out.print("1～12の月を入力してください: ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    break;
                } else {
                    System.out.println("月は1から12の間で入力してください。");
                }
            } else {
                System.out.println("無効な入力です。数字を入力してください。");
                scanner.next();
            }
        }

        // 季節を表示する
        String season = season(month);
        System.out.println(month + "月は、" + season + "の季節です。");
        scanner.close();
    }
}
