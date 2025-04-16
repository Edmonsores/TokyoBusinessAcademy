import java.util.Scanner;
public class Section3_4 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.println("体重はｋｇ単位で入力してください。");
	        int w = in.nextInt();
	        System.out.println("身長はｃｍ単位で入力してください。");
	        int h = in.nextInt();
	        in.close();

	        if (w >= 50 && w <= 70 && h >= 160 && h <= 180) {
	            System.out.println("平均的な人です。");
	        } else if (w < 50 && h < 160) {
	            System.out.println("少し小さいひとです。");
	        } else if (w > 70 && h > 180) {
	            System.out.println("大柄なひとです。");
	        } else {
	            System.out.println("体重は" + w + "kg。");
	            System.out.println("身長は" + h + "cm。");
	        }
	    }
	}
