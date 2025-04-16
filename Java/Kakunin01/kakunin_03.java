import java.util.Scanner;
public class kakunin_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("数字を選んでください:");
		System.out.println("1 - 三角形の面積を計算する");
		System.out.println("2 - ゲームの点を３つ入力する");
		System.out.println("3 - 円の面積を計算する");
		System.out.println("4 - 整数値を入力し、その値が２の倍数でもあり３の倍数でもあるかを判定する");
		System.out.println("終了コードは９９９９です");
		int n = in.nextInt();
		while (n!= 9999) {
		switch (n) {
		case 1:
			System.out.println("三角形の底辺と高さを入力して：");
			int base = in.nextInt();
			int height = in.nextInt();
			int area = (base+height)/2;
			System.out.println("三角形の面積:"+ area);
			break;
		case 2:
			System.out.println("ゲームの点を３つ入力すて：");
			int num3 = in.nextInt();
			int num4 = in.nextInt();
			int num5 = in.nextInt();
			int sum = num3+num4+num5;
			int avg = (num3+num4+num5)/3;
			System.out.println("ゲームの点の合計は"+sum+"と平均は"+avg);
			break;
		case 3:
			System.out.println("円の半径を入力すて：");
			double num6 = in.nextInt();
			double circlearea = 3.14 * num6 * num6; ;
			System.out.println("2つの数字の引き算は"+ circlearea);
			break;
		case 4:
			System.out.println("整数値を入力してください。");
			int num7 = in.nextInt();
			if (num7%2==0 && num7%3==0) {
			    System.out.println("正常値："+num7);
			}else {
				System.out.println("入力値"+num7+"は範囲外です");
			}
			break;
		default:
			System.out.println("入力エラー。");
		case 9999:
		in.close();
	}
    }
	}
}
