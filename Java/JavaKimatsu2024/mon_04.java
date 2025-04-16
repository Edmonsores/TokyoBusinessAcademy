import java.util.Scanner;
public class mon_04 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("整数を入力=>");
		int sei = stdin.nextInt();
		if (sei>=10&&sei<100) {
		System.out.println("2桁の整数値です");
		} else if (sei>=100&&sei<1000) {
		System.out.println("3桁の整数値です");
		} else {
		System.out.println("桁数がわかりません");
		}
		stdin.close();
	}
}
