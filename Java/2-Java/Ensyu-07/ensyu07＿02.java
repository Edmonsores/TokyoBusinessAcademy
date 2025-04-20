
public class ensyu07＿02 {

    public static int min(int A, int B, int C) {
        int minimum = A;        
        if (B < minimum) {
            minimum = B;
        }
        
        if (C < minimum) {
            minimum = C;
        }
        
        return minimum;
    }

    // メインメソッド
    public static void main(String[] args) {
        // テスト用の値
        int A = 10;
        int B = 5;
        int C = 20;

        // 最小値を求める
        int result = min(A, B, C);
        
        // 結果を表示
        System.out.print("A:"+A+", B:"+B+", C:"+C+"の最小値は:"+result);
    }
}
