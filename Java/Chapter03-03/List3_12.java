/*
 * P-89　ループ処理のネスト
 */
public class List3_12 {
	public static void main(String[] args) {
		for(int a=1; a<=3; a++) {
			System.out.println("a = "+a);
			for (int b = 1; b<= 3; b++) {
				System.out.println("  b = "+b);
			}
		}
	}

}
