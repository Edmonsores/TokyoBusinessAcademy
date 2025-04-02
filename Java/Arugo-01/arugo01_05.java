import java.util.Scanner;

public class arugo01_05 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("A商品の単価を入力してください。");
		double a=in.nextInt();
		System.out.println("B商品の単価を入力してください。");
		double b=in.nextInt();
		System.out.println("A商品の売上個数を入力してください。");
		double c=in.nextInt();
		System.out.println("B商品の売上個数を入力してください。");
		double d=in.nextInt();
		double e=0;
		double f=0;
		in.close();
		a=a*0.2;
		b=b*0.3;
		e=a*c;
		f=b*d;
		System.out.println("Aの商品売上合計は"+e);	
		System.out.println("Bの商品売上合計は"+f);	
	}

}
