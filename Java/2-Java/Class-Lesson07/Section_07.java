import java.util.Scanner;

class Seiseki {
    String studentId;
    String name;
    int grade;

    public Seiseki(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void printInfo() {
        System.out.println("学籍番号: " + studentId);
        System.out.println("氏名: " + name);
        System.out.println("成績: " + grade);
    }
}
public class Section_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seiseki[] students = new Seiseki[10];
        
        int numStudents = 0;
        while (numStudents < 1 || numStudents > 10) {
            System.out.print("入力する人数を入力してください: ");
            numStudents = scanner.nextInt();
            scanner.nextLine(); 

            if (numStudents < 1 || numStudents > 10) {
                System.out.println("人数は1から10の間で入力してください。");
            }
        }

 
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n" + (i + 1) + "番目の生徒情報を入力してください:");

            System.out.print("学籍番号: ");
            String studentId = scanner.nextLine();

            System.out.print("氏名: ");
            String name = scanner.nextLine();

            System.out.print("成績 (0–100): ");
            int grade = scanner.nextInt();
            scanner.nextLine(); 


            students[i] = new Seiseki(studentId, name, grade);
        }

        // Find the student with the highest grade
        Seiseki topStudent = findTopStudent(students, numStudents);

        System.out.println("\n最高点の生徒の情報:");
        if (topStudent != null) {
            topStudent.printInfo();
        } else {
            System.out.println("学生情報がありません。");
        }

        scanner.close();
    }

    // Method to find the student with the highest grade
    public static Seiseki findTopStudent(Seiseki[] students, int numStudents) {
        if (numStudents == 0) return null;
        
        Seiseki topStudent = students[0];
        for (int i = 1; i < numStudents; i++) {
            if (students[i].getGrade() > topStudent.getGrade()) {
                topStudent = students[i];
            }
        }
        return topStudent;
    }
}
