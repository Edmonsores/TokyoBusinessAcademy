import java.util.Scanner;

public class ClassMethode01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many students to register
        System.out.print("登録する人数を入力してください：");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline after nextInt()

        // Create an array based on user input
        ClassStudent[] students = new ClassStudent[numberOfStudents];

        // Input student information
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "人目の情報を入力してください：");
            System.out.print("名前：");
            String name = scanner.nextLine();

            System.out.print("学校番号（1:小学校、2:中学校、3:高校）：");
            int school = scanner.nextInt();

            System.out.print("学年：");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline after nextInt()

            students[i] = new ClassStudent(name, school, grade);
        }

        // Display all registered students
        System.out.println("\n登録されたメンバー情報");
        for (ClassStudent s : students) {
            s.displayInfo();
        }

        // Count students per school
        int[] schoolCounts = new int[3];  // [小, 中, 高]
        for (ClassStudent s : students) {
            if (s.getSchool() == 1) {
                schoolCounts[0]++;
            } else if (s.getSchool() == 2) {
                schoolCounts[1]++;
            } else if (s.getSchool() == 3) {
                schoolCounts[2]++;
            }
        }

        // Show school breakdown
        System.out.println("学校ごとの人数");
        System.out.println("小学生：" + schoolCounts[0] + "人");
        System.out.println("中学生：" + schoolCounts[1] + "人");
        System.out.println("高校生：" + schoolCounts[2] + "人");

        // Show middle school percentage
        ClassStudent.displayMiddleSchoolPercentage(schoolCounts[1], numberOfStudents);

        scanner.close();
    }
}

