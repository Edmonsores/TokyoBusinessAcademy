import java.util.Scanner;

public class ensyu05_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        System.out.println("整数値を入力してください（負の数で終了）：");

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            count++;        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("合計: " + sum);
            System.out.println("平均: " + average);
        } else {
            System.out.println("入力された負でない値がありません。");
        }

        scanner.close();
    }
}
