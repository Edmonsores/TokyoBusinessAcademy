import java.util.Scanner;

public class Section_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 学生の登録数を入力
        System.out.print("学生の人数を入力してください: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // 改行を消費
        
        // 学生を格納する配列
        student[] students = new student[numStudents];
        
        // 学生情報を入力してインスタンスを作成
        for (int i = 0; i < numStudents; i++) {
            System.out.print("学籍番号を入力: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // 改行を消費
            
            System.out.print("氏名を入力: ");
            String name = scanner.nextLine();
            
            System.out.print("成績点を入力: ");
            int score = scanner.nextInt();
            
            students[i] = new student(id, name, score);
        }
        
        // 全員の情報を表示
        System.out.println("\n学生情報一覧");
        for (int i = 0; i < students.length; i++) {
            students[i].PrintMethod();
        }
        
        // 平均点を表示
        System.out.println("\n平均点: " + student.AverageScore());
        
        // 平均点以上の人数を表示
        System.out.println("平均点以上の学生の数: " + student.AboveAverage(students));
        
        scanner.close();
    }
}

