
public class List5_ren04 {
	static int getTotalAge (Person p1,Person p2) {
		return p1.age + p2.age;
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Ian";
		a.age = 19;
		Person b = new Person();
		b.name = "Joshua";
		b.age =18;
		
		System.out.println(getTotalAge(a,b));
	}
}
