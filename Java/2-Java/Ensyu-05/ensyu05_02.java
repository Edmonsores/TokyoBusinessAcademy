import java.util.Scanner;
public class ensyu05_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("整数値を入力してください。合計が1000を超えるまで入力します。");

        while (true) {
            System.out.print("整数値を入力 (終了するには-1を入力)：");
            int inputValue = scanner.nextInt();


            if (inputValue == -1) {
                break;
            }

            if (sum + inputValue <= 1000) {
                sum += inputValue;
                count++; 
            } else {
                System.out.println("合計が1000を超えるため、入力を無視しました。");
            }
        }
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("合計:"+ sum);
        System.out.print("平均:"+ average);


        scanner.close();
    }
}
