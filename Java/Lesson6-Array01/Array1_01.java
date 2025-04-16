
public class Array1_01 {
	public static void main(String[] args) {
		int[] Array1;
		Array1 = new int[5];
		Array1[1]=37;
		Array1[2]=51;
		Array1[4]=Array1[1]*2;
		for(int i=0; i<5; i++) {
			System.out.println(Array1[i]);
		}
	}
}
