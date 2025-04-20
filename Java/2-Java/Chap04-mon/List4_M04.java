import java.util.Scanner;

public class List4_M04 {
    public static int getAbsoluteValue(int value) {
        if (value < 0) {
            return -value;
        } else {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("絶対値を計算したい数値を入力してください: ");
        int value = scanner.nextInt();

        int absoluteValue = getAbsoluteValue(value);
        System.out.println(value + " の絶対値は " + absoluteValue);

        scanner.close();
    }
}