import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int[] scoreAry;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int[] getScoreAry() { return scoreAry; }
    public void setScoreAry(int[] scoreAry) { this.scoreAry = scoreAry; }
}

public class chap05_mon_02 {
    public static final String[] SUBJECTS = { "国語", "数学", "英語" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("生徒の人数を入力してください：");
        int n = sc.nextInt();
        sc.nextLine();

        // 入力
        for (int i = 0; i < n; i++) {
            Student stu = new Student();

            System.out.print((i + 1) + "人目の名前：");
            stu.setName(sc.nextLine());

            int[] scores = new int[SUBJECTS.length];
            for (int j = 0; j < SUBJECTS.length; j++) {
                System.out.print(SUBJECTS[j] + "の点数：");
                scores[j] = sc.nextInt();
            }
            sc.nextLine();
            stu.setScoreAry(scores);
            students.add(stu);
        }

        System.out.println("\n--- 点数一覧 ---");
        System.out.print("名前\t");
        for (String s : SUBJECTS) System.out.print(s + "\t");
        System.out.println("合計");

        for (Student s : students) {
            int sum = 0;
            System.out.print(s.getName() + "\t");
            for (int score : s.getScoreAry()) {
                System.out.print(score + "\t");
                sum += score;
            }
            System.out.println(sum);
        }

        System.out.println("\n--- 科目ごとの平均 ---");
        for (int i = 0; i < SUBJECTS.length; i++) {
            int total = 0;
            for (Student s : students) {
                total += s.getScoreAry()[i];
            }
            double avg = (double) total / students.size();
            System.out.println(SUBJECTS[i] + "の平均：" + avg);
        }

        sc.close();
    }
}
