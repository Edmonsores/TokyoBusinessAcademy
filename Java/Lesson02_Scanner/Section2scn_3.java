import java.util.Scanner;
public class Section2scn_3 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("BMIの計算をしよう！");
		System.out.println("身長をメートルで入力したください");
		double height=in.nextDouble();
		System.out.println("体重をkgで入力したください");
		double weight=in.nextDouble();
		double bmi=weight/(height*height);
		System.out.println("あなたのBMIは"+(int)bmi);
		in.close();
	}

}
