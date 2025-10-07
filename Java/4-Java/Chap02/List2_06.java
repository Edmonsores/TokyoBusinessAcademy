/*P-48*/
public class List2_06 {
    public static void main(String args[]) {
        int[] scores = new int[5];
        int a = 4;
        // bの値を乱数で求める
        int b = (int) (Math.random() * 10);
        System.out.println("b=" + b);
        try {
            int c = a / b;
            System.out.println("cの値は" + c);
            scores[b] = 10;
            System.out.println("処理が正常に行われました");
        }
        // 例外(0で割り算)
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException 型の例外をキャッチしました");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException型の例外をキャッチしました");
            System.out.println(e);
        }
        System.out.println("プログラムを終了します");
    }
}