import java.util.Scanner;
public class ensyu06_04 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("クラス数を入力してください: ");
        int numClasses = scanner.nextInt();

        double[] totalScoresPerClass = new double[numClasses];
        double[] averageScoresPerClass = new double[numClasses];
        double totalScore = 0;
        int totalStudents = 0;

        // Loop through each class
        for (int i = 0; i < numClasses; i++) {
            System.out.print("クラス" + (i + 1) + "の生徒数を入力してください: ");
            int numStudents = scanner.nextInt();

            double classTotal = 0;  // To store the total score for this class

            // Loop through each student in the class
            for (int j = 0; j < numStudents; j++) {
                System.out.print("クラス"+ (i + 1) + "の生徒" + (j + 1) + "の点数を入力してください: ");
                double score = scanner.nextDouble();
                classTotal += score;
            }

            totalScoresPerClass[i] = classTotal;
            averageScoresPerClass[i] = classTotal / numStudents;

            // Add this class's total to the grand total
            totalScore  += classTotal;
            totalStudents += numStudents;
        }

        // Display the total and average scores for each class
		System.out.println();
        System.out.println("クラスの点数:");
        for (int i = 0; i < numClasses; i++) {
            System.out.println("クラス " + (i + 1) + ": 合計点数 = " + totalScoresPerClass[i] +
                    ", 平均点数 = " + averageScoresPerClass[i]);
        }

        // Display the grand total and average score for the entire school
        double grandAverageScore = totalScore  / totalStudents;
		System.out.println();
        System.out.println("全クラスの合計点数: " + totalScore );
        System.out.println("全クラスの平均点数: " + grandAverageScore);
        
        scanner.close();
    }
}
