
public class List5_ren01 {
	static void printInfo (Person p) {
		System.out.println("名前: " + p.name);
		System.out.println("年齢: " + p.age);
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Ian";
		a.age = 19;
		Person b = new Person();
		b.name = "Joshua";
		b.age =18;
		printInfo(a);
		printInfo(b);
	}
}

