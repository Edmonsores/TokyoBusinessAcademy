import java.util.Scanner;
public class List06_03 {
public static void main(String[]args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  // 3人分のデータを格納する為クラス型配列を定義
	 // Define an array to store data for 3 students
	  StudentCard[] students = new StudentCard[3];

      // キーボードから入力学籍番号と名前を入力して3人分の情報を表示
	 // Enter student ID numbers and names from the keyboard to display information for three people.
      System.out.println("3人分の学生情報を入力してください。");
      for (int i = 0; i < students.length; i++) {
    	  
          System.out.print((i + 1) + "人目の学籍番号を入力してください: ");
          String studentId = scanner.nextLine();
          System.out.print((i + 1) + "人目の氏名を入力してください: ");
          String name = scanner.nextLine();
          System.out.print((i + 1) + "人目の点数を入力してください: ");
          int score = scanner.nextInt();
          scanner.nextLine(); // 改行文字を読み飛ばす Skip the newline character
          
          students[i] = new StudentCard(studentId, name, score);
          System.out.println("Student " + (i + 1) + " info:");
          students[i].displayInfo();
          System.out.println();
      }

      // 三人の成績点の合計を求めるクラスメソッドを呼び出し、結果を表示
      //Call the class method to calculate the total score of the three students and display the result
      int totalScore = StudentCard.calculateTotalScore(students);
      System.out.println("\n3人の合計点は: " + totalScore + "点です。");
      System.out.println("クラス変数 totalScore の値: " + StudentCard.getTotalScore() + "点です。");
      
scanner.close();
}
}
