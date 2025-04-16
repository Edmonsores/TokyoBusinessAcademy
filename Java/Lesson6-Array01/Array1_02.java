
public class Array1_02 {
	public static void main(String[] args) {
		double[] Array2 = {1.2, 1.8, 3.5, 4.2, 8.0};
		for(int i=0; i< Array2.length; i++) {
			System.out.println(Array2[i]);
		}
		double sum = 0;
		for (int i = 0; i < Array2.length; i++) {
            sum += Array2[i];
        }
        System.out.println("合計は"+sum);
	}
}
