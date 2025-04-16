
public class Array1_05 {
	public static void main(String[] args) {
		double[]  Atbl1= { 1.2,1.8,3.5,4.2,8.0 };
		double[] Atbl2= { 1.2, 2.5, 3.2, 4.8, 5.1 };
		double[] Btbl;
			Btbl=new double[5];
		for (int i = 0; i < 5; i++) {
	        Btbl[i] = Atbl1[i] + Atbl2[i];
	    }
		for (int i = 0; i < 5; i++) {
            System.out.println(Btbl[i]);
        }
	}
}
