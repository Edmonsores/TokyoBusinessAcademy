import java.util.Scanner;
public class ensyu05_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int groupCount = 0; 
        
        while (groupCount < 10) {
            int groupSum = 0; 
            System.out.println("グループ " + (groupCount + 1) + " の5個の整数を入力してください（終了するには88888を、全体終了は99999を入力）：");

            for (int i = 0; i < 5; i++) {
                int num = scanner.nextInt();
                
                if (num == 99999) {
                    System.out.println("全体の入力を終了します。");
                    System.exit(0);
                } else if (num == 88888) {
                    System.out.println("現在のグループの入力を終了します。");
                    break;
                }
                groupSum += num;
            }
            totalSum += groupSum;
            groupCount++; 
            System.out.println("グループ " + (groupCount) + " の合計: " + groupSum);
        }
        System.out.println("全体の合計: " + totalSum);
        scanner.close();
    }
}
