
public class Section8Array＿01 {
	  public static void main(String[] args) {
	        int[] Atbl = {1, 3, 5, 7, 9};
	        int[] Btbl = {2, 4, 6, 8, 10};

	        int[] Ctbl = new int[10];
	        
	        for (int i = 0; i < 5; i++) {
	            Ctbl[i * 2] = Atbl[i];
	            Ctbl[i * 2 + 1] = Btbl[i];
	        }
	        System.out.println("Ctblの要素:");
	        for (int i = 0; i < Ctbl.length; i++) {
	        	System.out.print(Ctbl[i]+"  ");
	        }
	    }
}
