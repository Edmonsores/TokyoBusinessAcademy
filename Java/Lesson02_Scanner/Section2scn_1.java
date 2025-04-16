import java.util.Scanner;
public class Section2scn_1 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("整数を入力して");
		int intenger=in.nextInt();
		System.out.println("整数は"+intenger);
		System.out.println("小数点数を入力して");
		double dpn=in.nextDouble();
		System.out.println("小数点数は"+dpn);
		System.out.println("お名前を入力して");
		String message1=in.next();
		System.out.println("名前は"+message1);
		in.close();
		
		
	}
}
