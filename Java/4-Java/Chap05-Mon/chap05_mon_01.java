import java.util.ArrayList;
public class chap05_mon_01 {
	public static void main(String[] args) {
	       ArrayList<String> colorList = new ArrayList<>();
	        colorList.add("red");
	        colorList.add("green");
	        colorList.add("blue");
	        colorList.add("white");
	        for (int i = 0; i < colorList.size(); i++) {
	            System.out.println((i + 1) + " 番目の色は " + colorList.get(i) + " です。");
	        }
	        System.out.println("5 番目の色は black です。");
	    }
}
