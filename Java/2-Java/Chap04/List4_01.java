/*
 * P-106 Method
 */
public class List4_01 {
	public static void countdown() {
		System.out.println("カウントダウンをします");
		for(int i= 5; i >= 0; i--) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		//メソッドの呼び出し
		countdown();
	}

}
