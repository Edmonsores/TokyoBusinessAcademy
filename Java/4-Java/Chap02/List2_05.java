/*P-44*/
class SimpleClass {
    void doSomething() {
        int[] array = new int[3];
        // 例外: インデックスが10
        array[10] = 99;
        System.out.println("doSomethingメソッドを終了します");
    }
}
//main
public class List2_05 {
	public static void main(String[]args) {
		SimpleClass obj = new SimpleClass();
		try {
			obj.doSomething();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外をキャッチしました");
			e.printStackTrace();
		}
	}

}
