/*
 * P-87 continue文
 */
public class List3_11 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				continue;
			}
			sum +=i;
			System.out.println("変数sumに"+i+"を加えました。sumは"+sum);
		}
	}
}
