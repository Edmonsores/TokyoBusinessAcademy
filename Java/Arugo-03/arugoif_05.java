import java.util.Scanner;
public class arugoif_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("年齢を入力してください。");
		int A=in.nextInt();
		in.close();
		if (A>=19) {
			System.out.println("入場料金は１０００円。");
		}else if (18>=A&&A>=13)	{
			System.out.println("入場料金は８００円。");
		}else if (12>=A&&A>=6){
			System.out.println("入場料金は５００円。");	
	    }else {
	    	System.out.println("入場料金は２００円。");	
	    }
	}
}
