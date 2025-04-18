import java.util.Scanner;
public class arugo02_04 {
	public static void main(String[] args) {
		int[]TBL1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] ZAIKO = {2500, 3000, 1500, 650, 1400, 863, 945, 780, 600};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品番号を入力してください：");
		int productnumber = scanner.nextInt();
		System.out.println("出庫数を入力してください：");
		int productquantity = scanner.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if (productnumber == TBL1[i]) {
				if (ZAIKO[i] >= productquantity) {
      
					ZAIKO[i] -= productquantity;
                    System.out.println("出庫成功。在庫数は " + ZAIKO[i] + " になりました。");
                } else {
                    int shortage = productquantity - ZAIKO[i];
                    System.out.println(shortage + " 足りません。");
                }
                break;
			}	
		}
		scanner.close();
	}
}
