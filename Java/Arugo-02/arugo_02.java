import java.util.Scanner;
public class arugo_02 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("変数Xに値を入力してください。");
		int X=in.nextInt();
		System.out.println("変数Yに値を入力してください。");
		int Y=in.nextInt();
		in.close();
		int MAX;
		int MIN;
		if (X > Y) {
			MAX = X;
			MIN = Y;
		}else {
			MAX = Y;
			MIN = X;
	    }
		System.out.println("変数MAXの値は"+MAX);
		System.out.println("変数MINの値は"+MIN);
	}
}
