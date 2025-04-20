import java.util.Scanner;

public class List4_M03 {
    public static String getMessage(String name) {
        return "こんにちは " + name + " さん";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        String message = getMessage(name);
        System.out.println(message);

        scanner.close();
    }
}