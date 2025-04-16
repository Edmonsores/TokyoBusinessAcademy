import java.util.Scanner;
public class Section6_3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("数値を入力してください(終了するには0を入力してください): ");
            int number = in.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 1) {
                sum += number;
                count++;
            } else {
                System.out.println("1より大きい数字を入力してください。");
            }
        }

        if (count > 0) {
            int average = sum / count;
            System.out.println("合計: " + sum);
            System.out.println("平均: " + average);
        } else {
            System.out.println("有効な番号が入力されていません。");
        }

        in.close();
    }
}

