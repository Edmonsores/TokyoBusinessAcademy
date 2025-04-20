import java.util.Scanner;

public class arugo04_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("生徒数を入力してください: ");
        int n = scanner.nextInt();

        int[] table = new int[n];

        System.out.println("出席者数を入力してください:");
        for (int i = 0; i < n; i++) {
            table[i] = scanner.nextInt();
        }

        // Simple selection sort
        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < n; j++) {
                if (table[j] < table[indexMin]) {
                	indexMin = j;
                }
            }

            // Swap elements if necessary
            if (indexMin != i) {
                int temp = table[i];
                table[i] = table[indexMin];
                table[indexMin] = temp;
            }
        }

        System.out.println("出席番号の並び替え:");
        for (int i = 0; i < n; i++) {
            System.out.print(table[i] + " ");
        }
        scanner.close();
    }
}
