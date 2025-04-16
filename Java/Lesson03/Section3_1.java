import java.util.Scanner;
public class Section3_1 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("単価を入力してください。");
		int U = in.nextInt();
		System.out.println("数量を入力してください。");
		int Q = in.nextInt();
		in.close();
		double A = U * Q;
		if (A < 10000) {
			System.out.println("金額は"+(int)A);
		}else if (A>=10000 && A<20000) {
			A= A*0.95;
			System.out.println("５％ＯＦＦの金額は"+(int)A);
		}else if (A>=20000 && A<30000) {
			A= A*0.90;
			System.out.println("１０％ＯＦＦの金額は"+(int)A);
		}else {
			A= A*0.80;
			System.out.println("２０％ＯＦＦの金額は"+(int)A);
		}
	}
}
