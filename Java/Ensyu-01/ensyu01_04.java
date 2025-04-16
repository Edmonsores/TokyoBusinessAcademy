import java.util.Scanner;
public class ensyu01_04 {
    public static void main(String[] args) {
    	Scanner stdin = new Scanner(System.in);
    	System.out.println("数字を入力して：");
		int x=stdin.nextInt();
		System.out.println("もう一つの数字を入力して：");
		int y=stdin.nextInt();
		System.out.println("もう一つの数字を入力して：");
		int z=stdin.nextInt();
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		System.out.println("合計:x+y+z="+(x+y+z));
		System.out.println("平均:(x+y+z)/3="+((x+y+z)/3));
		stdin.close();
	}
}