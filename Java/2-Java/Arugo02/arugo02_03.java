import java.util.Scanner;
public class arugo02_03 {
	public static void main(String[] args) {
		
		int[]TBL1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] TBL2 = {2500, 3000, 1500, 650, 1400, 863, 945, 780, 600};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品番号を入力してください：");
		int input = scanner.nextInt();
		int index = -1;
		for(int i = 0; i < 10; i++) {
			if (input == TBL1[i]) {
				index = i;
				break;
			}
			
		}
		if(index!= -1) {
			System.out.println("商品番号"+input+"の単価は"+TBL2[index]+"です。");
		}else {
			System.out.println("商品番号が見つかりません");
		}
		scanner.close();
	}
}

