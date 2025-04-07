/*
 * 分岐処理フロー　問題1
 */
import java.util.Scanner;
public class arugoif_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力してください。");
		int A=in.nextInt();
		in.close();
		if (A>=100) {
			A = A-100;
		}
		System.out.println("整数値は"+A);
		
	}
}
