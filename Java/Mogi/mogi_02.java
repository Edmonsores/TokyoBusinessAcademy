import java.util.Scanner;
public class mogi_02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxScore;
        int minScore;

        System.out.print("プレーヤー１のゲーム点(0から300まで):");
        int score = scanner.nextInt();
        
        while (score < 0 || score > 300) {
            System.out.println("スコアが無効です。0～300 の値を入力してください。");
            score = scanner.nextInt();
        }
        maxScore = score;
        minScore = score;
        System.out.println("プレーヤー1のゲーム点: " + score);
        for (int i = 2; i <= 5; i++) {
            System.out.print("プレーヤー" + i + "のゲーム点(0から300まで): ");
            score = scanner.nextInt();
            while (score < 0 || score > 300) {
                System.out.println("スコアが無効です。0～300 の値を入力してください。");
                score = scanner.nextInt();
            }
            System.out.println("Player " + i + "のゲーム点: " + score);

            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("ゲーム点の最大値: " + maxScore);
        System.out.println("ゲーム点の最小値: " + minScore);

        scanner.close();
	    }
		
}	


