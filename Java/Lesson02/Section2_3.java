
public class Section2_3 {
	public static void main (String [] args) {
		double x;
		x = 10;
		double y;
		y = 3;
		System.out.println("xは"+x);
		System.out.println("yは"+y);
		System.out.println("x+yは"+(x+y));
		double ans;
		ans = 0;
		ans = x%=y;
		System.out.println("x÷yの余りは"+(int)ans);
		
	}
}
