import java.util.Scanner;
public class Section5_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		System.out.println("2つの数値を入力しましょう");
		System.out.println("数値を入力してください");
		int A = in.nextInt();
		System.out.println("以前より大きな数値を入力してください");
		int B = in.nextInt();
		if (A >= B) {
	        System.out.println("エラー");
	    }
		for(int i=A; i<=B; i++) {
			sum += i;
			avg = sum / (B - A + 1);
		}
		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+avg+"です。");
		in.close();
	}
}
