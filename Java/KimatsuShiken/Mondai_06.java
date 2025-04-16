import java.util.Scanner;
public class Mondai_06 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int totalAmount = 0;
	        int ageCount = 0;

	        for (int i = 0; i < 5; i++) {
	            System.out.print((i + 1) + "人目の年齢を入力してください: ");
	            int age = scanner.nextInt();
	            
	            if (age >= 0 && age <= 3) {

	                totalAmount += 0;
	            } else if (age >= 4 && age <= 18) {

	                totalAmount += 800;
	                ageCount++;
	            } else if (age >= 19 && age <= 60) {
	                totalAmount += 1000;
	            } else {
	                totalAmount += 300;
	            }
	        }

	        System.out.println("1日の入園料合計額: " + totalAmount + "円");
	        System.out.println("4歳から18歳までの人数: " + ageCount + "人");

	        scanner.close();
	    }
	}
