import java.util.ArrayList;
public class List05_01 {
	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<String>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		
		System.out.println("要素数"+months.size());
		for(int i=0; i<months.size(); i++) {
			System.out.println(months.get(i));
		}
		
		months.remove(1);
		System.out.println("要素数"+months.size());
		for(int i=0; i<months.size(); i++) {
			System.out.println(months.get(i));
		}
	}

}
