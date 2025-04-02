import java.util.Scanner;

public class arugo01_03 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("単価を入力してください。");
		int x=in.nextInt();
		System.out.println("数量を入力してください。");
		int y=in.nextInt();
		double tax=0.1;
		double ans=0;
		in.close();
		ans=x*y;
		tax=ans*tax;
		ans=ans+tax;
		System.out.println("税込み価格は"+ans);	
	}
}
