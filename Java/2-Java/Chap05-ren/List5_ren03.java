
public class List5_ren03 {
	static void printYoungerPersonName (Person p1,Person p2) {
		if(p1.age > p2.age) {
			System.out.println(p2.name);
		}else {
			System.out.println(p1.name);
		}
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Ian";
		a.age = 19;
		Person b = new Person();
		b.name = "Joshua";
		b.age =18;
		
		printYoungerPersonName(a,b);
	}
}
