/*
 * P56 三角形の面積を求める（Calculate the area of triangle)
 * キーボードから底辺と高さを入力(Enter tha base and height from the keyboard
 */
import java.util.Scanner;
public class List2_16 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("三角形の面積を計算します。");
		System.out.println("底辺と長さを入力したください");
		double base=in.nextDouble();
		System.out.println("高さを入力したください");
		double height=in.nextDouble();
		double area=base*height/2.0;
		System.out.println("面積は"+area);
		in.close();
	}
}
