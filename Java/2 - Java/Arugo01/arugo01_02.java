import java.util.Scanner;
public class arugo01_02 {
    public static void main(String[] args) {

        int[] Arrye = new int[20];
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        

        while (index < Arrye.length) {
            System.out.print("1から100の間の値を入力してください: ");
            int input = scanner.nextInt(); 
            
 
            if (input >= 1 && input <= 100) {
                Arrye[index] = input;
                index++;
            } else {
                System.out.println("1から100の間の値を入力してください。");
            }
        }
        

        System.out.println("配列の値は次の通りです:");
        for (int i = 0; i < Arrye.length; i++) {
            System.out.println("Arrye[" + i + "] = " + Arrye[i]);
        }
        
        scanner.close();
    }
}

