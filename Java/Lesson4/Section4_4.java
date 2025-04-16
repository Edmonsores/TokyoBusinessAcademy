import java.util.Scanner;
public class Section4_4 {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("値を入力してください");
	        int A = in.nextInt();
	        in.close();
	        if (A >= 20 && A <= 35) {
	            if (A == 30) {
	                System.out.println("取消の値です");
	            } else {
	                System.out.println("正常値入力");
	            }
	        } else {
	            System.out.println("入力エラー");
	        }
	    }
	}

