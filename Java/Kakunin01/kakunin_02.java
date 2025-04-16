import java.util.Scanner;
public class kakunin_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("生徒の学籍番号を入力してください：");
		int gakusei=in.nextInt();
		 if (gakusei >=240100 && gakusei<=240200) {
			 System.out.println("生徒の氏名を入力してください：");
			 String name=in.next();
			 System.out.println("生徒の年齢を入力してください：");
			 int age=in.nextInt();
			 System.out.println("生徒の学年を入力してください：");
			 int gakunen =in.nextInt();
			 System.out.println("学籍番号："+gakusei+"  "+gakunen+"学年");
			 System.out.println("氏名："+name+"さん  "+age+"才");
		 }else {
			 System.out.println("入力エラー");
		 }
		 in.close();
	}
}
