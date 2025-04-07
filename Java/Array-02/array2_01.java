public class array2_01 {
	public static void main(String[] args) {
		int [][] Atbl= {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		int[] Ctbl=new int [20];
		int x=0;
		for(int i=0; i<Atbl.length; i++) {
			for(int j=0; j<Atbl[i].length; j++) {
				Ctbl[x]=Atbl[i][j];
			    x++;
		}
	}
	for(int i=0; i<12; i++) {
		System.out.print(Ctbl[i]+" ");
		
	}	
	}
}
