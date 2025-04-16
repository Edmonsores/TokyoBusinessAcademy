
public class List3_17 {
	public static void main(String[] args) {
		int [][] scores= {
				{10,20,30},
				{100,200,300},
				{1000,2000,3000}
		};
		for(int i=0;i<scores.length;i++) {
			for(int x=0;x<scores[i].length;x++) {
			    System.out.print(scores[i][x]+" ");
		    }
		    System.out.println("");
	    }
    } 
}
