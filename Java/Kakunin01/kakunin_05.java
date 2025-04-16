
public class kakunin_05 {
	public static void main(String[] args) {
        int[][] tbl = {
            {10, 10 + 10, 10 + 20},
            {20, 20 + 10, 20 + 20},
            {30, 30 + 10, 30 + 20}
        };
        int Total = 0;
        System.out.println("値	 値+10	 値+20	 合計");
        for (int i = 0; i < tbl.length; i++) {
            int Sum = 0;
            for (int j = 0; j < tbl[i].length; j++) {
                Sum += tbl[i][j];
                System.out.print(tbl[i][j] + "     ");
            }
            Total += Sum;
            System.out.println(Sum);
        }
        System.out.println("総合計: " + Total);
    }
}

