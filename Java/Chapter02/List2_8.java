
public class List2_8 {
	public static void main (String [] args) {
		int i = 10;
		int j = i*2;
		System.out.println("jの値は"+j);
		//２つの変数を定義して四則演算を行い表示する　
		//Define two variables, perform four arithmetic operations, and display
		int sei1=40;
		int sei2= 2;
		int ans=0;
		ans=sei1+sei2;
		System.out.println("足し算は"+ans);//Tashizan=Addtion
		System.out.println("引き算は"+(sei1-sei2));//Hikizan=Subtraction
		System.out.println("掛け算は"+(sei1*sei2));//kakezan=multiplication
		ans=sei1/sei2;
		System.out.println("割り算は"+ans);//warizan=division
		//余りを求める　find the remainder
		int a=10;
		int ab=3;
		System.out.println("余りは"+(a%ab));
	}
}
