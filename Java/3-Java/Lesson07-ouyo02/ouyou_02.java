
import java.util.Scanner;
public class ouyou_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itPassCount = 0;
        int officePassCount = 0;
        
        while (true) {
            System.out.println("\n成績を入力する学生の学科を選択してください。");
            System.out.print("（1: IT学科, 2: オフィス学科, 0: 終了: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // ループを終了
            }

            // choiceの値によって処理を分岐
            if (choice == 1 || choice == 2) {
                System.out.print("学籍番号を入力してください: ");
                String id = scanner.next();
                System.out.print("氏名を入力してください: ");
                String name = scanner.next();
                
                TSBStudent student; // スーパークラスの型で変数を宣言

                if (choice == 1) { // IT学科
                    System.out.print("アルゴリズムの点数を入力してください: ");
                    int algScore = scanner.nextInt();
                    System.out.print("JAVAの点数を入力してください:  ");
                    int javaScore = scanner.nextInt();
                    System.out.print("WEBの点数を入力してください:  ");
                    int webScore = scanner.nextInt();
                    
                    student = new ITDepartment(id, name, algScore, javaScore, webScore);
                    
                } else { // オフィス学科
                    System.out.print("Wordの点数を入力してください: ");
                    int wordScore = scanner.nextInt();
                    System.out.print("Excelの点数を入力してください: ");
                    int excelScore = scanner.nextInt();

                    student = new OfficeDepartment(id, name, wordScore, excelScore);
                }

                // ポリモーフィズムの実証：Demonstration of polymorphism:
                // student変数がIT学科/オフィス学科のどちらのインスタンスを持っていても、Whether the student variable holds an instance of the IT department or the office department,
                // 実行時に適切なクラスのメソッドが呼び出される。the method of the appropriate class will be called at runtime.
                student.gradeEvaluationShow();
                
                // 合格者の人数をカウント
                if (student.isPass()) {
                    switch (student.getDepartment()) {
                        case "IT":
                            itPassCount++;
                            break;
                        case "Office":
                            officePassCount++;
                            break;
                    }
                }

            } else {
                System.out.println("無効な選択です。1, 2, 0のいずれかを入力してください。");
            }
        }
        
        // 最終結果の表示
        System.out.println("\nプログラム終了");
        System.out.println("IT学科の合格者数: " + itPassCount + "名");
        System.out.println("オフィス学科の合格者数: " + officePassCount + "名");
        
        scanner.close();
    }
}