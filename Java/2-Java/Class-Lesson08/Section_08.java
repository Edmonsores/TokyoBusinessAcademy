import java.util.Scanner;

class Item {
    int productNumber;
    int quantity;
    int unitPrice;
    int totalPrice;

    // Constructor
    public Item(int productNumber, int quantity) {
        this.productNumber = productNumber;
        this.quantity = quantity;
        this.unitPrice = 0;
        this.totalPrice = 0;
    }

    // Method to determine unit price based on product number
    public void PriceMethod() {
        switch (productNumber) {
            case 101:
                unitPrice = 2500;
                break;
            case 102:
                unitPrice = 3600;
                break;
            case 103:
                unitPrice = 2800;
                break;
            default:
                System.out.println("Invalid product number(無効な製品番号)");
        }
    }

    // Method to calculate total price based on unit price and quantity
    public void SumMethod() {
        totalPrice = unitPrice * quantity;
    }

    // Method to apply a 10% discount if unit price >= 200
    public void DiscountMethod() {
        if (unitPrice >= 200) {
            totalPrice = (int) (totalPrice * 0.9);
        }
    }

    // Method to print all fields
    public void PrintMethod() {
        System.out.println("Product Number(商品番号): " + productNumber);
        System.out.println("Quantity(個数): " + quantity);
        System.out.println("Unit Price(単価): " + unitPrice);
        System.out.println("Total Price(金額): " + totalPrice);
        System.out.println(" ");
    }
}

// Main class to handle user input and manage an array of items
public class Section_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of transactions(伝票の数):");
        int transactionCount = scanner.nextInt();

        // Create an array of Item objects
        Item[] items = new Item[transactionCount];

        // Initialize each item with user input
        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Enter product number for transaction(伝票の数分の商品番号) " + (i + 1) + ":");
            int productNumber = scanner.nextInt();
            System.out.println("Enter quantity for transaction(伝票の数分の個数) " + (i + 1) + ":");
            int quantity = scanner.nextInt();


            items[i] = new Item(productNumber, quantity);

            // Determine unit price and calculate total price
            items[i].PriceMethod();
            items[i].SumMethod();
        }

        // Apply discounts
        for (int i = 0; i < items.length; i++) {
            items[i].DiscountMethod();
        }


        // Print all transaction details
        System.out.println("\nTransaction Details(伝票の情報):");
        for (int i = 0; i < items.length; i++) {
        	items[i].PrintMethod();
        }

        scanner.close();
    }
}
