import java.util.Scanner;
public class kakunin_01Sensei {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		int gakuno;
		int java;
		int python;
		int avr;
		String moji;
		int max=-1;
		int min=101;
		
		for(int i=0; i<3; i++) {
			System.out.println("学籍番号=>");
			gakuno=in.nextInt();
			System.out.println("Java点数=>");
			java=in.nextInt();
			System.out.println("Python点数=>");
			python=in.nextInt();
			
			avr=java+python/2;
			
			if(avr<=40) {
				moji="D";
			}else if(avr<=60){
				moji="C";
			}else if(avr<=80){
				moji="B";
			}else {
				moji="A";
		    }
			System.out.println("学籍番号："+gakuno);
			System.out.println("Java点数："+java);
			System.out.println("Python点数："+python);
			System.out.println("評価："+moji);
			
			if(max<avr) {
				max=avr;
			}
			if(min>avr) {
				max=avr;
			}
			
	    }
		in.close();
	}
}
