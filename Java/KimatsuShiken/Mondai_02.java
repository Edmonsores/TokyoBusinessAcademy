import java.util.Scanner;
public class Mondai_02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("入力可能整数");
        } else if (number % 3 == 0 || number % 4 == 0) {
            System.out.println("入力チェックが必要");
        } else {
            System.out.println("入力不可");
        }

        scanner.close();
    }
}
