/*
 * P55 キーボードからの入力
 */
import java.util.Scanner;
public class List2_15 {
	public static void main (String [] args) {
		//Scannerの準備
		Scanner in = new Scanner (System.in);
		System.out.println("あなたのお名前は？");
		String name = in.next();
		System.out.println(name+"さん、こんにちは。");
		System.out.println("あなたの年齢＝＞");
		int age=in.nextInt();
		System.out.println(age+"歳です。");
		//小数点double型の値を入力
		System.out.println("小数点付き実数＝＞");
		double ddd=in.nextDouble();
		System.out.println("小数点付きの値"+ddd);
		//Scannerの解放
		in.close();
	}
}
