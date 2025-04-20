public class arugo04_02 {
    public static void main(String[] args) {
        int[] arry = {64, 34, 25, 12, 22, 11, 90, 2, 55, 20};

        System.out.println("元の配列:");
        printArray(arry);

        // Bubble sort
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - i - 1; j++) {
                if (arry[j] < arry[j + 1]) {
                    // Swap elements
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }

        System.out.println("ソートされた配列（降順）:");
        printArray(arry);
    }

    public static void printArray(int[] arry) {
        for (int num : arry) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}