/*
 * P-86 ループ処理の流れをの変更
 */
public class List3_10 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.println("変数sumに"+i+"を加えました。sumは"+sum);
			if (sum>20) {
				System.out.println("合計が２０を超えました。");
				break;
			}
		}
	}
}
