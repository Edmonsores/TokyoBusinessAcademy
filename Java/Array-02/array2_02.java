import java.util.Scanner;
public class array2_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("行数を入力してください：");
		 int rows = in.nextInt();
		System.out.print("例数を入力してください：");
		 int cols = in.nextInt();
		
		int[][] Atbl= new int [rows][cols];
		for(int i=0; i<Atbl.length; i++) {
			int val=1;
			for(int j=0;j<Atbl[i].length;j++) {
				Atbl[i][j]=(int) Math.pow(val, i+1);
				val++;
			}
	    }
		for(int i=0; i<Atbl.length; i++) {
			for(int j=0;j<Atbl[i].length;j++) {
				System.out.print(Atbl[i][j]+" ");
			}
			System.out.println();
		}
		in.close();
	}
}
