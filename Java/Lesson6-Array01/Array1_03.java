import java.util.Scanner;
public class Array1_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int[] Atbl = new int[5];
	     int[] Btbl = new int[5];
		System.out.println("Atbl配列に値を入力してください");
		for (int i = 0; i < Atbl.length; i++) {
            System.out.print("Atbl[" + i + "]: ");
            Atbl[i] = in.nextInt();
		}
		for (int i = 0; i < Atbl.length; i++) {
	            Btbl[i] = Atbl[i];
	    }
		   System.out.println("Atbl:");
	        for (int i = 0; i < Atbl.length; i++) {
	            System.out.println("Atbl[" + i + "]: " + Atbl[i]);
	        }
	        System.out.println("Btbl:");
	        for (int i = 0; i < Btbl.length; i++) {
	            System.out.println("Btbl[" + i + "]: " + Btbl[i]);
	        }
	        in.close();
	}
}
