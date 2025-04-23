package chap06_mon1;

public class mon01_4_15 {
	public static void main (String[]args) {
		
		System.out.println("STudentCard.counter"+Student.counter);
		
		
		Student a = new Student(12345, "鈴木太郎");
		a.printmethod();
		System.out.println("StudentCard.counter="+Student.counter);
		
		Student b = new Student(12346, "佐藤花子");
		b.printmethod();
		
	}

}
