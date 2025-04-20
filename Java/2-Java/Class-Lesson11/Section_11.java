import java.util.Scanner;

public class Section_11 {
    // クラスメソッド: 青のキャップの人数に基づいて評価を行う
    public static String CapColor(Student1[] students) {
        double blueCapPercentage = (double) Student1.blueCapCount / students.length;
        if (blueCapPercentage > 0.4) {
            return "優秀";
        } else if (blueCapPercentage >= 0.3) {
            return "普通";
        } else {
            return "指導";
        }
    }

    // クラスメソッド: ６年生の人数を数える
    public static int countSixthGraders(Student1[] students) {
        int sixthGraderCount = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].year == 6) {
                sixthGraderCount++;
            }
        }
        return sixthGraderCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("人数を入力してください: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // 改行を読み飛ばす(Skip newline)

        Student1[] students = new Student1[numStudents];

        // 学生情報を入力(Enter student information)
        for (int i = 0; i < numStudents; i++) {
            System.out.print("名前を入力: ");
            String name = scanner.nextLine();
            System.out.print("級（1～2, 3～5, 6～8）を入力: ");
            int grade = scanner.nextInt();
            System.out.print("学年（1～6）を入力: ");
            int year = scanner.nextInt();
            scanner.nextLine();  // 改行を読み飛ばす(Skip newline)

            // インスタンス生成
            students[i] = new Student1(name, grade, year);
            students[i].assignCapColor();  // キャップの色を判定(Determine the color of the cap)
        }

        // すべての生徒情報を表示 (Print information for all students)
        System.out.println("すべての生徒情報:");
        for (int i = 0; i < students.length; i++) {
            students[i].PrintMethod();
        }

        // 赤いキャップの生徒情報を表示
        System.out.println("赤いキャップの生徒情報:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].capColor.equals("赤")) {
                students[i].PrintMethod();
            }
        }

        // ６年生の人数を表示
        int sixthGraderCount = Section_11.countSixthGraders(students);
        System.out.println("６年生の人数: " + sixthGraderCount);

        // 青いキャップの生徒状況を表示
        String evaluation = Section_11.CapColor(students);
        System.out.println("青いキャップの生徒状況: " + evaluation);

        scanner.close();
    }
}
