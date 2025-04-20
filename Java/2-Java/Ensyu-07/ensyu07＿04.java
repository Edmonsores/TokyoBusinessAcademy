
public class ensyu07＿04 {

    // 1からnまでの整数の和を求めるメソッド
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // メインメソッド
    public static void main(String[] args) {
        int n = 58;
        int result = sum(n);  // メソッドを呼び出し
        System.out.println("1から " + n + " までの和は: " + result);
    }
}
