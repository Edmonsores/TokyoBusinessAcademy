class DataSet2 {
    int[] data = new int[1000];
}

public class List4_2 {
    public static void main(String[] args) {
        System.out.println("空きメモリサイズ: " + Runtime.getRuntime().freeMemory());

        DataSet2[] data = new DataSet2[10000];

        for (int i = 0; i < 10000; i++) {
            data[i] = new DataSet2(); // 新しいインスタンスを生成し、配列に格納します
            data[i] = null;          // nullを代入します

            if ((i + 1) % 100 == 0) {
                System.out.println("生成済みインスタンス数: ➡ " 
                                 + (i + 1) + " 空きメモリサイズ: ➡ " 
                                 + Runtime.getRuntime().freeMemory());
            }
        }
    }
}