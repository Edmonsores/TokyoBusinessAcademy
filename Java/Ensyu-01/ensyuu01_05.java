import java.util.Scanner;
public class ensyuu01_05 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
    	System.out.println("小数点数を入力して：");
		double A=stdin.nextDouble();
		System.out.println("もう一つの小数点数を入力して：");
		double B=stdin.nextDouble();
		System.out.println("a="+A);
		System.out.println("b="+B);
		System.out.println("合計:A+B="+(A+B));
		System.out.println("平均:(A+B)/2="+((A+B)/2));
		stdin.close();
	}
}
