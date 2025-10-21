
public class rensyu2_3 {
	public static void main(String[] args) {
		try {
            // 何らかの処理 (Some process)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("例外処理A");
        } catch (Exception e) {
            System.out.println("例外処理B");
        }
        System.out.println("プログラムを終了します");
	}
}
