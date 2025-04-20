import java.util.Scanner;

public class arugo03_01 {
    public static void main(String[] args) {
        int[] TBL = {20, 60, 33, 45, 95, 71, 25, 88, 66, 57};

        Scanner scanner = new Scanner(System.in);
        System.out.print("検索キー（Y）を入力してください: ");
        int Y = scanner.nextInt();

        // Perform sequential search
        boolean found = false;
        int tel = -1;

        for (int i = 0; i < TBL.length; i++) {
            if (TBL[i] == Y) {
                found = true;
                tel = i + 1;
                break;
            }
        }

        if (found) {
            System.out.println("検索キーあり");
            System.out.println("TELの何番目: " + tel);
        } else {
            System.out.println("検索キーなし");
        }

        scanner.close();
    }
}
