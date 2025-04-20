import java.util.Scanner;

public class arugo03_02 {
    public static void main(String[] args) {
    	int[] TBL={20,25,33,45,57,60,66,71,88,95};

        Scanner scanner = new Scanner(System.in);
        System.out.print("検索キー（Y）を入力してください: ");
        int Y = scanner.nextInt();

        // binary search
        int low = 0;
        int high = TBL.length - 1;
        int i = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (TBL[mid] == Y) {

                i = mid + 1; // 1-based index for TEL position
                break;
            } else if (TBL[mid] < Y) {
            	low = mid + 1;
            } else {
            	high = mid - 1;
            }
        }

        if (i != -1) {
            System.out.println("検索キーあり");
            System.out.println("TELの何番目: " + i);
        } else {
            System.out.println("検索キーなし");
        }

        scanner.close();
    }
}
