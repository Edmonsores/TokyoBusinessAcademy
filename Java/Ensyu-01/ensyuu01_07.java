import java.util.Scanner;
public class ensyuu01_07 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
    	System.out.println("４桁の整数値を入力して：");
    	int x=stdin.nextInt();
    	int y=x/10;
    	int z=x%10;
    	System.out.println("整数値＝＞"+x);
    	System.out.println("最下位桁を除いた値は"+y+"です。");
    	System.out.println("最下位桁は "+z+"です。");
    	stdin.close();
	}
}
