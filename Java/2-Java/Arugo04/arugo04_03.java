import java.util.Scanner;

public class arugo04_03 {
    public static void main(String[] args) {
        int[] table = {1111, 1562, 1020, 1330, 1200, 1650};
        String[] array = {"加藤", "斉藤", "山田ひろし", "田代", "後藤", "品川"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("出席番号を入力してください: ");
        int attendanceNumber = scanner.nextInt();

        // Sequential search
        int i = 0;
        while (i < table.length && table[i] != attendanceNumber) {
            i++;
        }

        if (i < table.length) {
            System.out.println("名前： " + array[i]);
        } else {
            System.out.println("エラー処理は無");
        }
        scanner.close();
    }
}