import java.util.Scanner;
public class arugoif_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("2つの整数値を入力してください。");
		int A=in.nextInt();
		int B=in.nextInt();
		in.close();
		if (A==B) {
			System.out.println("AとBは同じ値。");
		}else if (A>B)	{
			System.out.println("A値が大きい。");
		}else {
			System.out.println("B値が大きい。");	
	    }
	}
}
