import java.util.Scanner;

public class List4_M06 {
    public static int getAbsoluteValue(int value) {
        if (value < 0) {
            return -value;
        } else {
            return value;
        }
    }

    public static boolean isSameAbsoluteValue(int i, int j) {
        return getAbsoluteValue(i) == getAbsoluteValue(j);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の数値を入力してください: ");
        int i = scanner.nextInt();

        System.out.print("2つ目の数値を入力してください: ");
        int j = scanner.nextInt();

        boolean result = isSameAbsoluteValue(i, j);
        System.out.println(i + " と " + j + " の絶対値は同じですか？ " + result);

        scanner.close();
    }
}