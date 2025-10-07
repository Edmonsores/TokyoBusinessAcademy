
public class List2_04 {
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
			return;
		}
		finally {
			System.out.println("finallyブロックの処理です");
		}
		System.out.println("プログラムを終了します");
	}
}
