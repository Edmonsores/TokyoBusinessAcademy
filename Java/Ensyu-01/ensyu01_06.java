import java.util.Scanner;
public class ensyu01_06 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
    	System.out.println("名前を入力して：");
    	String name = stdin.next();
       	System.out.println("今日の日を入力して：");
       	int day = stdin.nextInt();
       	System.out.println("今日の月を入力して：");
       	int month = stdin.nextInt();
       	System.out.println("今日の年を入力して：");
       	int year = stdin.nextInt();
     	System.out.println("私の名前は："+name+"です。　今日の日付は"	+year+"/"+month+"/"+day+"です。");
		stdin.close();
	}
}
