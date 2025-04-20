import java.util.Scanner;

public class List4_M01 {
    public static void printHello(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("「Hello」を印刷する回数を入力する： ");
        int count = scanner.nextInt();
        printHello(count);
        scanner.close();
    }
}
