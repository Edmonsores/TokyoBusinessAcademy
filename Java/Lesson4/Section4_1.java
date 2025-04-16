import java.util.Scanner;
public class Section4_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力してください。");
		int A=in.nextInt();
		in.close();
		if (A>=10&&A<=100) {
			System.out.println("２桁の整数値です。");
		}else if (A>=100&&A<=999)	{
			System.out.println("３桁の整数値です。");
		}else {
			System.out.println("桁数がわかりません。");
		}
	}
}

