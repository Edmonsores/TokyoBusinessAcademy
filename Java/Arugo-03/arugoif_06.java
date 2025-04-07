import java.util.Scanner;
public class arugoif_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("変数に値を入力してください。");
		int A=in.nextInt();
		in.close();
		if (A%2==0&&A%3==0) {
			System.out.println("2の倍数でもあり3の倍数でもある");
		}else if (A%2==0)	{
			System.out.println("２の倍数です。");
		}else if (A%3==0){
			System.out.println("３の倍数です。");
		}
	}
}
