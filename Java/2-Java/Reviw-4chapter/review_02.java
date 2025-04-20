import java.util.Scanner;
public class review_02 {
	public static int[][] TBLfunction(int gyou, int retu, int start, int increment){
		int[][] tbl=new int[gyou][retu];
        int x = start;

        for (int i = 0; i < gyou; i++) {
            for (int j = 0; j < retu; j++) {
                tbl[i][j] = x;
                x += increment;
            }
        }
		return tbl;
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("行数を入力してください: ");
	        int gyou = in.nextInt();
	        System.out.print("列数を入力してください: ");
	        int retu = in.nextInt();
	        System.out.print("始まりの値を入力してください: ");
	        int start = in.nextInt();
	        System.out.print("次の値に加える数を入力してください: ");
	        int increment = in.nextInt();
	        
	        int[][] array = TBLfunction(gyou, retu, start, increment);


	        System.out.println("生成された2次元配列:");
	        for (int i = 0; i < gyou; i++) {
	            for (int j = 0; j < retu; j++) {
	                System.out.printf("%4d",array[i][j]);
	            }
	            System.out.println();
	        }
	      
		 in.close();
	}

}
