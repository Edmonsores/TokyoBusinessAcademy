import java.util.Scanner;
public class ensyu05_01 {
	public static void main(String[]args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        //number of integers
	        System.out.print("加算する整数の数を入力してください: ");
	        int numOfIntegers = scanner.nextInt();
	        
	        int sum = 0;
	        int count = 0;
	        
	       
	        for (int i = 0; i < numOfIntegers; i++) {
	            System.out.print("整数を入力してください（停止するには 0 を入力してください）: ");
	            int input = scanner.nextInt();
	            
	            if (input == 0) {
	                break;
	            }
	            
	            sum += input;
	            count++;
	        }
	        
	        if(numOfIntegers > 0) {

	        double average = (double) sum / count;
	        
	        System.out.println("合計: " + sum);
	        System.out.println("平均: " + average);
	        }
	        else {
	        	System.out.println("エラー");
	        }
	        
	        scanner.close();
	    }
	}
