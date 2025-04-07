import java.util.Scanner;
public class Arugo_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("年齢を入力してください: ");
        int age = in.nextInt();

        System.out.print("既婚か未婚別を入力してください: (1-既婚, 2-未婚別): ");
        int maritalStatus = in.nextInt();
        if (maritalStatus == 1) {
            if ((age >= 10 && age < 20) || age >= 60) {
            	System.out.println("支給金額は30000円。");
            } else if (age >= 20 && age < 40) {
            	System.out.println("支給金額は50000円。");
            } else if (age >= 40 && age < 60) {
            	System.out.println("支給金額は70000円。");
            }
        } else if (maritalStatus == 2) {
            if ((age >= 10 && age < 20) || age >= 60) {
            	System.out.println("支給金額は10000円。");
            } else if (age >= 20 && age < 40) {
            	System.out.println("支給金額は20000円。");
            } else if (age >= 40 && age < 60) {
            	System.out.println("支給金額は40000円。");
            }
        }else {
            System.out.println("入力エラー");
	    }	
        in.close();
    }
}
