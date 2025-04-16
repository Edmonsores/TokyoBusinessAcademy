import java.util.Scanner;
public class Mondai_08 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] Data = new int[5][3]; // 2次元配列の定義
        int[] TBL = new int[5]; // 各行の合計を保存する配列

        // 2次元配列に値を入力
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " 行目の値を入力してください（3つの整数）:");
            for (int j = 0; j < 3; j++) {
                Data[i][j] = scanner.nextInt();
            }
        }

        // 各行の合計を計算して TBL に代入
        for (int i = 0; i < 5; i++) {
            int sum = 0; // 各行の合計を初期化
            for (int j = 0; j < 3; j++) {
                sum += Data[i][j]; // 合計を計算
            }
            TBL[i] = sum; // 合計を TBL に代入
        }

        // TBL の値を表示
        System.out.print("各行の合計: [");
        for (int i = 0; i < TBL.length; i++) {
            System.out.print(TBL[i]);
            if (i < TBL.length - 1) {
                System.out.print(", "); // 最後の要素以外にカンマを追加
            }
        }
        System.out.println("]");

        scanner.close();
    }
}

