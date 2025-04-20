import java.util.Scanner;

public class arugo04_04 {
    public static int binarySearch(int[] array, int targetProductNo) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == targetProductNo) {
                return mid;
            } else if (array[mid] < targetProductNo) {
            	low = mid + 1;
            } else {
            	high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] productNumbers = {1000, 1200, 1350, 1351, 2000, 2025, 2500, 3000, 3500, 3501};

        Scanner scanner = new Scanner(System.in);
        System.out.print("製品番号を入力してください: ");
        int targetProductNo = scanner.nextInt();

        int index = binarySearch(productNumbers, targetProductNo);

        if (index != -1) {
            System.out.println("インデックスで見つかった製品: " + index);
        } else {
            System.out.println("入力エラー");
        }
        scanner.close();
    }
}