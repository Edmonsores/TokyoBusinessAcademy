import java.util.Scanner;

public class List4_M02 {
    public static double getRectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("長方形の幅を入力してください： ");
        double width = scanner.nextDouble();

        System.out.print("長方形の高さを入力してください： ");
        double height = scanner.nextDouble();

        double area = getRectangleArea(width, height);
        System.out.println("長方形の面積は" + area);

        scanner.close();
    }
}