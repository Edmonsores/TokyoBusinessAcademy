import java.util.Scanner;
public class Arugo_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("計算してみましょう！");
		System.out.println("数字を選んでください:");
		System.out.println("1 - 足し算");
		System.out.println("2 - 掛け算");
		System.out.println("3 - 引き算");
		System.out.println("4 - 割り算");
		int n = in.nextInt();
		switch (n) {
		case 1:
			System.out.println("2つの整数値を入力してください。");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int ans1 = num1+num2;
			System.out.println("2つの数字の足し算は"+ ans1);
			break;
		case 2:
			System.out.println("2つの整数値を入力してください。");
			int num3 = in.nextInt();
			int num4 = in.nextInt();
			int ans2 = num3*num4;
			System.out.println("2つの数字の掛け算は"+ ans2);
			break;
		case 3:
			System.out.println("2つの整数値を入力してください。");
			int num5 = in.nextInt();
			int num6 = in.nextInt();
			int ans3 = num5-num6;
			System.out.println("2つの数字の引き算は"+ ans3);
			break;
		case 4:
			System.out.println("2つの整数値を入力してください。");
			int num7 = in.nextInt();
			int num8 = in.nextInt();
			int ans4 = num7/num8;
			System.out.println("2つの数字の割り算は"+ ans4);
			break;
		default:
			System.out.println("入力エラー。");
		
	}
		in.close();
    }
}
