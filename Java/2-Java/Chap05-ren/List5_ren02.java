
public class List5_ren02 {
	static boolean ageCheck (Person p, int i) {
		return p.age > i;
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Ian";
		a.age = 19;
		Person b = new Person();
		b.name = "Joshua";
		b.age =18;
		System.out.println(ageCheck(a, 13));

	}
}

