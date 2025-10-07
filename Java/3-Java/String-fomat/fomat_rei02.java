import java.util.Date;
public class fomat_rei02 {
	public static void main(String[] args) {
		double pi = 3.14159;
		int number = 1000000;
		Date date = new Date();
		
		String formattedString = String.format("円周率：%.2f, 数値：%d, 日付： %tY-%tm-%td", pi, number, date, date, date);
		
		System.out.println(formattedString);
	}

}
