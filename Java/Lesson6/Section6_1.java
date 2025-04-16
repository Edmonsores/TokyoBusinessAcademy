import java.util.Scanner;
public class Section6_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("正の整数値を入力してください");
		int i = in.nextInt();
		while (i < 0) {
	        System.out.println("入力エラー");
	        System.out.println("正の整数値を入力してください");
	        i = in.nextInt();
	    }
		while (i>=0) {
			System.out.println(i);
			i--;
		}
		in.close();
	}
}
