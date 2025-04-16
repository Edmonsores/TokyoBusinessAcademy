import java.util.Scanner;
public class mogi_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("計算してみましょう！");
		System.out.println("数字を選んでください:");
		System.out.println("1 - 円の面積を求める");
		System.out.println("2 -  円の体積を求める");
		System.out.println("3 - 三角形の面積を求める");
		System.out.println("4 - ひし形の面積を求める");
		int n = in.nextInt();
		switch (n) {
		case 1:
			System.out.println("円の半径を入力してください。");
			double radius = in.nextInt();
			double ans1 = radius*radius*3.14;
			System.out.println("円の面積は"+ ans1);
			break;
		case 2:
			System.out.println("円の半径を入力してください。");
			double radius2 = in.nextInt();
			System.out.println("円の高さを入力してください。");
			double height = in.nextInt();
			double ans2 = radius2*radius2*3.14*height;
			System.out.println("円の体積は"+ ans2);
			break;
		case 3:
			System.out.println("三角形の底辺を入力してください。");
			double base = in.nextInt();
			System.out.println("三角形の高さを入力してください。");
			double height3 = in.nextInt();
			double ans3 = base*height3/2;
			System.out.println("三角形の面積は"+ ans3);
			break;
		case 4:
			System.out.println("ひし形の対角線を入力してください。");
			int diagonal = in.nextInt();
			int ans4 = diagonal*diagonal/2;
			System.out.println("ひし形の面積は"+ ans4);
			break;
		default:
			System.out.println("入力エラー。");
		
	}
		in.close();
    }

}
