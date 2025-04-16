
public class List3_16 {
	public static void main(String[] args) {
	
		int [][] scores1=new int[3][3];
		//1行目
		scores1[0][0]=13;
		scores1[0][1]=23;
		scores1[0][2]=33;
		//２行目
		scores1[1][0]=14;
		scores1[1][1]=24;
		scores1[1][2]=34;
		//３行目
		scores1[2][0]=15;
		scores1[2][1]=25;
		scores1[2][2]=35;
		for(int i=0;i<3;i++) {
			for(int x=0;x<3;x++) {
			    System.out.print(scores1[i][x]+" ");
			}
			System.out.println("");
		}
	}
}
