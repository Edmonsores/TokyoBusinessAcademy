import java.util.Scanner;

public class List4_M05 {
    public static double getAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の数値を入力してください: ");
        double a = scanner.nextDouble();

        System.out.print("2つ目の数値を入力してください: ");
        double b = scanner.nextDouble();

        System.out.print("3つ目の数値を入力してください: ");
        double c = scanner.nextDouble();

        double average = getAverage(a, b, c);
        System.out.println("平均は " + average);

        scanner.close();
    }
}