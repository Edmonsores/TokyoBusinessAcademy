import java.util.Scanner;
public class Section7_01 {
    public static void printfun(int score) {
        switch (score) {
            case 1:
                System.out.println("良く出来ました。");
                break;
            case 2:
                System.out.println("もう少し頑張りましょう。");
                break;
            case 3:
                System.out.println("不合格です。");
                break;
            default:
                System.out.println("無効な入力です。");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pythonの点数を入力してください: ");
        int pythonScore = scanner.nextInt();
        System.out.print("Javaの点数を入力してください: ");
        int javaScore = scanner.nextInt();

        int feedbackScore;

        if (pythonScore >= 60 && javaScore >= 60) {
            feedbackScore = 1;
        } else if (pythonScore >= 60 || javaScore >= 60) {
            feedbackScore = 2;
        } else {
            feedbackScore = 3;
        }

        printfun(feedbackScore);

        scanner.close();
    }
}

