
public class List3_07_1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=10; i<=100; i=i+10) {
			sum += i;
			System.out.println(i+"を加えました");
		}
		System.out.println("合計は"+sum+"です。");
	}
}
