
public class mogi_05 {
	public static void main(String[] args) {
		int [][] TBL2= {
		{5, 3, 2, 1, 4, 0, 0},
		{4, 5, 4, 5, 5, 0, 0},
		{3, 2, 5, 4, 3, 0, 0},
		{2, 3, 3, 1, 1, 0, 0},
		{0, 0, 0, 0, 0, 0, 0},
        };
		for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += TBL2[i][j];
            }
            TBL2[i][5] = sum;          // Store the sum in the 6th column
            TBL2[i][6] = sum / 5;      // Store the average in the 7th column
        }

        // Calculate the sum for each column
        for (int j = 0; j < 5; j++) {
            int columnSum = 0;
            for (int i = 0; i < 4; i++) {
                columnSum += TBL2[i][j];
            }
            TBL2[4][j] = columnSum;      // Store the column sum in the last row
        }

        // Calculate the total sum and average across all columns
        int totalSum = 0;
        for (int j = 0; j < 5; j++) {
            totalSum += TBL2[4][j];
        }
        TBL2[4][5] = totalSum;           // Store the total sum in the 6th column
        TBL2[4][6] = totalSum / 4;       // Store the overall average in the 7th column

     
        System.out.println("    問１ 問２ 問３ 問４ 問５ 合計 平均");
        String[] row = {"１件", "２件", "３件", "４件", "合計"};
        for (int i = 0; i < TBL2.length; i++) {
        	System.out.print(row[i] + "  ");
            for (int j = 0; j < TBL2[i].length; j++) {
                System.out.print(TBL2[i][j] + "   ");
            }
            System.out.println(); 
        }
}
}
