import java.util.Scanner;
public class kakunin_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		while(i<3) {
		System.out.print("生徒の学籍番号を入力してください：");
		 int gakusei=in.nextInt();
		 if (gakusei >=100 && gakusei<=300) {
			 System.out.print("JAVAの点数を入力してください：");
			 int java=in.nextInt();
			 System.out.print("Pythonの点数を入力してください：");
			 int python=in.nextInt();
			 int avg = (java+python)/2;
			 if (avg >=0 && avg >=40) {
				System.out.println(gakusei + "の評価：D");   
	        }else if(avg >=41 && avg >=60) {
	        	System.out.println(gakusei + "の評価：C"); 
		    }else if(avg >=61 && avg >=80) {
	        	System.out.println(gakusei + "の評価：B");  	
		    }else if(avg >=81 && avg >=100) {
     	    System.out.println(gakusei + "の評価：A"); 
	        }
			i++;
		 } else {
             System.out.println("学籍番号エラー");
         }
		 }
	in.close();
	}
}
