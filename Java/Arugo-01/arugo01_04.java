import java.util.Scanner;

public class arugo01_04 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("BMIと標準体重の計算をしよう！");
		System.out.println("身長をcmで入力したください");
		double a=in.nextDouble();
		System.out.println("体重をgで入力したください");
		double b=in.nextDouble();
		double bmi=0;
		double sw=0;
		in.close();
		a=a/100;
		b=b/1000;
		bmi=a*a;
		bmi=b/bmi;
		sw=a*a;
		sw=sw*22;
		System.out.println("BMIは"+bmi);	
		System.out.println("標準体重は"+sw);	
		
	}
}
