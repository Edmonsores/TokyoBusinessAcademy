
public class ensyu06_01 {
	public static void main(String[]args) {
		
		int[][] TBLA = {
				{1, 2, 3},
				{2, 3, 1},
				{3, 1, 2},
				{2, 1, 3}
		};
		int [][] TBLB = {
				{4, 3, 2, 1},
				{3, 2, 1, 4},
				{2, 1, 4, 3}
		};
		int[][]TBLC = new int[4][4];
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				TBLC[i][j] = TBLA[i][0]*TBLB[0][j]
						    + TBLA[i][1]*TBLB[1][j]
						    + TBLA[i][2]*TBLB[2][j];
			}
		}
		System.out.println("TBLC:");
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(TBLC[i][j]+" ");
			}
			System.out.println();
		}
	}
}
