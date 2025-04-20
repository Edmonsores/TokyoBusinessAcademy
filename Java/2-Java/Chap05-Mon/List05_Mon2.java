import java.util.Scanner;

class Scores {
   int javaScore;
   int pythonScore;
   int algorithmScore;

    public Scores(int javaScore1, int pythonScore1, int algorithmScore1) {
        javaScore1 = javaScore;
        pythonScore1 = pythonScore;
        algorithmScore1 = algorithmScore;
    }

    public void displayScores() {
        System.out.println("Javaの点数: " + javaScore);
        System.out.println("Pythonの点数: " + pythonScore);
        System.out.println("アルゴリズムの点数: " + algorithmScore);
    }
}

public class List05_Mon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Scores[] students = new Scores[5];

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "人目の点数を入力してください:");
            
            System.out.print("Javaの点数: ");
            int javaScore = scanner.nextInt();
            
            System.out.print("Pythonの点数: ");
            int pythonScore = scanner.nextInt();
            
            System.out.print("アルゴリズムの点数: ");
            int algorithmScore = scanner.nextInt();

            students[i] = new Scores(javaScore, pythonScore, algorithmScore);
        }

        // 各学生の点数を表示
        System.out.println("\n入力された点数を表示します");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "人目:");
            students[i].displayScores();
            System.out.println();
        }

        scanner.close();
    }
}