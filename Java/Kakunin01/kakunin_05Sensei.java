
public class kakunin_05Sensei {
	public static void main(String[] args) {
		int [][] tbl2=new int[3][4];
		int sogoke=0;
		for(int i=0; i<tbl2.length; i++) {
			int val=10*(i+1);
			for(int j=0; j<tbl2[i].length-1; j++) {
				tbl2[i][j]=val;
				tbl2[i][3]=val;
				val+=10;
			}
			sogoke+=tbl2[i][3];
		}
		System.out.println("値	 値+10	 値+20	 合計");
		for(int i=0; i<tbl2.length; i++) {
			for(int j=0; j<tbl2[i].length; j++) {
				System.out.print(tbl2[i][j]+"\t  ");
			}
			System.out.println("");
	    }
		System.out.println("総合計: " + sogoke);
    }
}
