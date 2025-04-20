public class ensyu07＿01 {

    public static int signof(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // メインメソッド
    public static void main(String[] args) {
        // テスト用の入力値
        int[] testValues = {-1, 0, 1};

        for (int value : testValues) {
            int result = signof(value);
            System.out.println("入力:"+value+", 結果:"+result);
        }
    }
}
