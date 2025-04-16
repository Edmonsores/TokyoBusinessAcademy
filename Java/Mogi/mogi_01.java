import java.util.Scanner;
public class mogi_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("学科名:");
		String department = in.next();
		
		System.out.println("氏名 :");
		String name = in.next();
		
		System.out.println("国語の点数:");
		int language = in.nextInt();
		
		System.out.println("数学の点数:");
		int math = in.nextInt();
		
		System.out.println("英語の点数:");
		int english = in.nextInt();
		in.close();
		int sum;
		int avg;
		
		sum = language+math+english;
		avg = sum/3;
		String grade;
		if(avg <=100 || avg >=80) {
			grade = "優";
		}else if(avg <=79 || avg >=60){
			grade = "良";
		}else if(avg <=59 || avg >=40){
			grade = "可";
		}else {
			grade = "不可";
		}
		System.out.println("３教科の合計点は"+sum+"点・平均点は"+avg+"点です。");
		System.out.println(department+"学科の"+name+"さんの成績評価は"+grade+"です。");
	}		
}
