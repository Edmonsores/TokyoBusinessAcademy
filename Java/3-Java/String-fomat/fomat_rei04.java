
public class fomat_rei04 {
	public static void main(String[] args) {
		String name = "花子";
		int age = 30;
		double height = 158.5;
		
		String formattedString = String.format("名前：%s, 年齢：%d, 身長：%.1f cm", name, age, height);
		System.out.println(formattedString);
		
	}

}
