/*
 * P-102
 */
public class List3_17 {
	public static void main(String[] args) {
		int[] counts = {1,3,5,6,5,2};
		for(int i=0; i<6; i++) {
		System.out.print(i+":");
		for (int j=0; j<counts[i]; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	}
}
