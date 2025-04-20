
import java.util.Scanner;

public class Section7_02 {

    // 売上の合計を計算し、目標金額に対する達成率を返すメソッド
    public static int uriagefun(int[] TBL, int kingaku) {
        int sum = 0;
        // TBL配列の値の合計を求める
        for (int i = 0; i < TBL.length; i++) {
            sum += TBL[i];
        }
        // 合計額を表示
        System.out.println("合計額は " + sum + " です。");

        // 達成率を計算し、整数として返却
        int rate = (int)((double)sum / kingaku * 100);
        return rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 6か月分の売り上げを入力し、配列Dtblに格納
        int[] Dtbl = new int[6];
        System.out.println("6か月分の売り上げを入力してください。");
        for (int i = 0; i < Dtbl.length; i++) {
            System.out.print((i + 1) + "か月目の売り上げ: ");
            Dtbl[i] = scanner.nextInt();
        }

        // 目標金額を入力
        System.out.print("目標金額を入力してください: ");
        int kingaku = scanner.nextInt();

        // uriagefunメソッドを呼び出し、達成率を取得
        int rate = uriagefun(Dtbl, kingaku);
        System.out.println("達成率は " + rate + "% です。");

        // 達成率に基づいてメッセージを表示
        if (rate >= 100) {
            System.out.println("目標達成！");
        } else if (rate >= 80) {
            System.out.println("もう少しですね");
        } else {
            System.out.println("後半に頑張りましょう");
        }
        scanner.close();
    }
}
