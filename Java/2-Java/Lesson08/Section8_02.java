import java.util.Scanner;
public class Section8_02 {


    public static int[] multiply(int num) {
        int[] tbl = new int[10];
        tbl[1]=num;
        for (int i = 2; i < tbl.length; i++) {
        	tbl[i] = 2*tbl[i-1];
        }
        return tbl;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("乗算する値を入力してください:");
        int inputNum = scanner.nextInt();

        int[] result = multiply(inputNum);

        System.out.print("TBL: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
