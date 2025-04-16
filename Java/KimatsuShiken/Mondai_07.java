
public class Mondai_07 {
	public static void main(String[] args) {
        int[] TBL = {10, 20, 30, 25, 31, 46, 96, 68, 70, 23, 50, 60, 10, 40};

        double sum = 0;  // 合計値
        int count = 0; // カウント

        // インデックス番号4から12までの値を合計
        for (int i = 4; i <= 12; i++) {
            sum += TBL[i]; // 合計に加算
            count++;       // カウントを増やす
        }
        // 平均を計算
        double average = sum / count;

        System.out.println("合計: " + sum);
        System.out.println("平均: " + average);
    }
}
