import java.util.Scanner;
public class Section8_03 {

    private static String[] categories = {"文房具", "衣類", "電化製品", "家具"};
    private static int[] prices = {500, 2500, 5000, 15000};

    public static int calculateAmount(int productNumber, int quantity) {
        int index = (productNumber / 1000) - 1;
        return prices[index] * quantity;
    }

    public static boolean ProductNumber(int productNumber) {
        return productNumber >= 1000 && productNumber <= 4999;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productNumber;
        int quantity;

        while (true) {
            System.out.print("商品番号を入力してください（9999で終了）：");
            productNumber = scanner.nextInt();

            if (productNumber == 9999) {
                System.out.println("プログラムを終了します。");
                break; 
            }

            while (!ProductNumber(productNumber)) {
                System.out.print("エラー: 商品番号は1000〜4999の範囲で入力してください。再度入力してください：");
                productNumber = scanner.nextInt();
            }

            int index = (productNumber / 1000) - 1;
            String category = categories[index];

            System.out.print("数量を入力してください：");
            quantity = scanner.nextInt();

            int amount = calculateAmount(productNumber, quantity);

            System.out.printf("商品番号: %d 商品分類名: %s 単価: %d 円 数量: %d 金額: %d 円%n",
                    productNumber, category, prices[index], quantity, amount);
        }

        scanner.close();
    }
}
