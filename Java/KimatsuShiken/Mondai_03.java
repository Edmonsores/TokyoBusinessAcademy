import java.util.Scanner;
public class Mondai_03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("商品の数量を入力してください: ");
        int quantity = scanner.nextInt();
        System.out.print("商品の単価を入力してください: ");
        double unitPrice = scanner.nextDouble();

        double totalAmount = quantity * unitPrice;

        if (quantity >= 100 && unitPrice >= 50000) {
            totalAmount *= 0.9;
        }
        System.out.println("金額: " + totalAmount + "円");
        scanner.close();
    }
}

