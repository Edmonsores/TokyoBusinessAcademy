import java.util.Scanner;
class Score {
    int java;
    int python;
    int algorithm;
    public int calculateTotal() {
        return java + python + algorithm;
    }
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}

public class List05_Mon1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Score scores = new Score();

        System.out.println("Javaの点数を入力してください:");
        scores.java = scanner.nextInt();

        System.out.println("Pythonの点数を入力してください:");
        scores.python = scanner.nextInt();

        System.out.println("アルゴリズムの点数を入力してください:");
        scores.algorithm = scanner.nextInt();

        int total = scores.calculateTotal();
        double average = scores.calculateAverage();

        System.out.println("合計点: " + total);
        System.out.println("平均点: " + average);

        scanner.close();
    }
}

