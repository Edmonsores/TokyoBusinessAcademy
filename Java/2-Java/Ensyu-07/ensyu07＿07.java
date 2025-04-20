
public class ensyu07＿07 {

    public static void putChars(char C, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(C);
        }
        System.out.println();
    }

    // putCharsを内部で呼び出して '*' をn個表示するメソッド
    public static void putStars(int n) {
        putChars('*', n);
    }

    // メインメソッド：直角三角形を表示
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            putStars(i);
        }
    }
}

