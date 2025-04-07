import java.util.Scanner;
public class arugoif_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("A商品の単価を入力してください。");
		int UnitPrice=in.nextInt();
		System.out.println("A商品の数量を入力してください。");
		int Quantity=in.nextInt();
		in.close();
		double SalesAmount;
		SalesAmount = UnitPrice * Quantity;
		if (SalesAmount >=10000) {
			SalesAmount = SalesAmount * 0.8;
			
		}
		System.out.println("A商品の売上額は" + SalesAmount);
	}
}
