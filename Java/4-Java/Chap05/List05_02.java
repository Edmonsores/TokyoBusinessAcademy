/*
 * P-98
 * */
import java.util.ArrayList;
public class List05_02 {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		integerList.add(Integer.valueOf(50));
		integerList.add(Integer.valueOf(100));
		
		Integer integer0=integerList.get(0);
		Integer integer1=integerList.get(1);
		
		int i0=integer0.intValue();
		int i1=integer1.intValue();
		
		System.out.println(i0);
		System.out.println(i1);
	}
}
