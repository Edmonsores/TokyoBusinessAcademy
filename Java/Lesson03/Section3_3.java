import java.util.Scanner;
public class Section3_3 {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.println("処理番号を入力して、各処理を行う。");
	        System.out.println("1: 三角形の面積を求める");
	        System.out.println("2: 台形の面積を求める");
	        System.out.println("3: 円の面積を求める");
	        System.out.println("4: 正方形の面積を求める");

	        int processNumber = in.nextInt();

	        switch (processNumber) {
	            case 1:
	                TriangleArea(in);
	                break;
	            case 2:
	                TrapezoidArea(in);
	                break;
	            case 3:
	                CircleArea(in);
	                break;
	            case 4:
	                SquareArea(in);
	                break;
	            default:
	                System.out.println("入力番号エラー");
	        }
	    }

	    private static void TriangleArea(Scanner in) {
	        System.out.println("三角形の底辺の長さを入力してください:");
	        double b = in.nextDouble();
	        System.out.println("三角形の高さを入力してください:");
	        double h = in.nextDouble();
	        double a = 0.5 * b * h;
	        System.out.println("三角形の面積は" + a);
	    }

	    private static void TrapezoidArea(Scanner in) {
	        System.out.println("台形の最初の底辺の長さを入力してください:");
	        double b1 = in.nextDouble();
	        System.out.println("台形の2番目の底辺の長さを入力してください::");
	        double b2 = in.nextDouble();
	        System.out.println("台形の高さを入力してください:");
	        double h = in.nextDouble();
	        double a = 0.5 * (b1 + b2) * h;
	        System.out.println("台形の面積は" + a);
	    }

	    private static void CircleArea(Scanner in) {
	        System.out.println("円の半径を入力してください:");
	        double r = in.nextDouble();
	        double a = Math.PI * r * r;
	        System.out.println("円の面積は" + a);
	    }

	    private static void SquareArea(Scanner in) {
	        System.out.println("正方形の辺の長さを入力してください:");
	        double s = in.nextDouble();
	        double a = s * s;
	        System.out.println("正方形の面積は" + a);
	    }
}


