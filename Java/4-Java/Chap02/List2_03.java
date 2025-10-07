/*P-42*/
public class List2_03 {
	public static void main(String[]args) {
		int a = 4;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("cの値は"+c);
		}
		catch (ArithmeticException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e);
		}
		System.out.println("プログラムを終了します");
	}

}
