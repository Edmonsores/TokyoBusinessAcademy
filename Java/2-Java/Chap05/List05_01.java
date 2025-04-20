/*
 * P-140
 */
class StudentCard{
	int id;
	String name;
}
public class List05_01 {
	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		a.id = 1234;
		a.name = "Edgard";
		
		StudentCard b = new StudentCard();
		b.id = 1235;
		b.name = "Sanjid";
		
		StudentCard c =b;
		c.id = 1236;
		c.name = "Ian";
		
		System.out.println("aのidの値は" + a.id);
		System.out.println("aのnameの値は" + a.name);
		
		System.out.println("bのidの値は" + b.id);
		System.out.println("bのnameの値は" + b.name);
		
		System.out.println("cのidの値は" + c.id);
		System.out.println("cのnameの値は" + c.name);
		
	}
}
