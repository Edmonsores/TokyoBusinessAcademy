import java.util.Scanner;
public class ensyu06_03 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
        // Definir o tamanho da matriz
        System.out.print("行数を入力します: ");
        int row = scanner.nextInt();
        System.out.print("列数を入力します: ");
        int col = scanner.nextInt();

        int[][] TBL = new int[row][col];

        // Preenchendo a matriz com valores crescentes
        int value = 1; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            	TBL[i][j] = value;
                value++;
            }
        }
        System.out.println("TBL:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(TBL[i][j] + "\t");  // \t para alinhar os valores
            }
            System.out.println();
        }
        scanner.close();
    }
}
