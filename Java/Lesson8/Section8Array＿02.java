
public class Section8Array＿02 {
	public static void main(String[] args) {
		int[][] Atbl = {
				{1, 2, 3, 4},
				{10, 20, 30 ,40},
				{100, 200, 300, 400}	
		};
		int[] Ctbl = new int[15];
        int index = 0;
		 for (int i = 0; i < Atbl.length; i++) {         
	            for (int j = 0; j < Atbl[i].length; j++) {  
	                Ctbl[index] = Atbl[i][j];               
	                index++;                                
	            }
	        }
	        System.out.println("Ctbl:");
	        for (int value : Ctbl) {
	            System.out.print(value + " ");
	        }
	}
}
