import java.util.Scanner;
public class Section2scn_4 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("３つ整数を入力して演算をしよう！");
		System.out.println("整数1を入力したください");
		int number1=in.nextInt();
		System.out.println("整数2を入力したください");
		int number2=in.nextInt();
		System.out.println("整数3を入力したください");
		int number3=in.nextInt();
		int ans1 = number1+number2;
		int ans2 = number2-number3;
		int ans3 = number3*number1;
		int ans4 = number1/number2;
		System.out.println("整数1+整数2は"+ans1);
		System.out.println("整数2-整数3は"+ans2);
		System.out.println("整数3+整数1は"+ans3);
		System.out.println("整数1+整数2は"+ans4);
		in.close();
	}
}
