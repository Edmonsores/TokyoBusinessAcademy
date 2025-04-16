
public class Section3_2 {
	public static void main (String [] args) {
		double A = 5.6;
		double B = 9.9;
		double C = 3.2;
		double max = A;
		double min = A;
		if (B > max) {
			max = B;
		}else if (C > max) {
			max = C;
		}
		if (B < min) {
			min = B;
		}else if (C < min) {
			min = C;
		}
		System.out.println("最大値:" + max);	
		System.out.println("最小値:" + min);
	}
}


