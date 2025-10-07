import java.util.Date;
public class fomat_rei01 {
	public static void main(String[] args) {
		String name = "太郎";
		int age = 25;
		Date date = new Date();
		
		String formattedString = String.format("名前：%s, 年齢：%d, 日付： %tF", name, age, date);
		
		System.out.println(formattedString);
	}
}
