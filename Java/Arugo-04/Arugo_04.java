import java.util.Scanner;
public class Arugo_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("体重をキログラムで入力してください:");
        double weight = in.nextDouble();
        System.out.print("身長をメートル単位で入力してください:");
        double height = in.nextDouble();
        double bmi = weight/ (height*height);
        in.close();
        if (bmi < 18.5) {
        	System.out.println("痩せ");
        } else if (bmi >= 18.5 && bmi < 25) {
        	System.out.println("普通");
        } else if (bmi >= 25 && bmi < 30) {
        	System.out.println("肥満 1 度");  
        } else if (bmi >= 30 && bmi < 35) {
        	System.out.println("肥満 2 度");  
        } else if (bmi >= 35 && bmi < 40) {
        	System.out.println("肥満 3 度");  
        } else {
        	System.out.println("肥満 4 度");
        }
    }
}
