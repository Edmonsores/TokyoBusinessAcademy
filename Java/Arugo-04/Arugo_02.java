import java.util.Scanner;
public class Arugo_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("商品の単価をキーボードから入力してください。");
		double UnitPrice = in.nextInt();
		System.out.println("商品の数量をキーボードから入力してください。");
		double Quantity = in.nextInt();
		double FinalPrice = UnitPrice*Quantity;
		if (UnitPrice >= 10000 && Quantity >= 5000) {
            System.out.println("30％割引後の価格は"+ FinalPrice*0.7);
		} else if (UnitPrice >=  10000 || Quantity >= 5000) {
            System.out.println("20％割引後の価格は"+ FinalPrice*0.8);
		} else {
            System.out.println("価格は"+ FinalPrice);
	    }	
		in.close();
    }
}