import java.util.Scanner;
public class arugoif_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("整数値を入力してください。");
		int A=in.nextInt();
		in.close();
		if (A==0) {
			System.out.println("整数値は０です。");
		}else if (A<0)	{
			System.out.println("負の整数値です。");
		}else {
			System.out.println("正の整数値です。");	
	    }
	}
}
