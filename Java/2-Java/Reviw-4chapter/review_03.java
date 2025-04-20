import java.util.Scanner;

public class review_03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("商品番号を入力してください（9999で終了）：");
            int productNumber = scanner.nextInt();
            if (productNumber == 9999) {
                System.out.println("プログラムを終了します。");
                break;
            }
           
            System.out.print("数量を入力してください：");
            int quantity = scanner.nextInt();
           
            String productName;
            int unitPrice;
            int totalPrice;
            
            if (productNumber == 1000) {
                productName = "文房具";
                unitPrice = 500;
            } else if (productNumber == 2000) {
                productName = "衣類";
                unitPrice = 2500;
            } else if (productNumber == 3000) {
                productName = "電化製品";
                unitPrice = 5000;
            } else if (productNumber == 4000) {
                productName = "家具";
                unitPrice = 15000;
            } else {
                System.out.println("無効な商品番号です。");
                continue;
            }
       
            totalPrice = unitPrice * quantity;
            
            System.out.println("商品番号:"+productNumber+", 商品分類名:"+productName+", 単価:"+unitPrice+", 数量:"+quantity+", 金額: "+totalPrice);
        }
        
        scanner.close();
    }
}
