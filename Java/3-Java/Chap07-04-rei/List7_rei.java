
public class List7_rei {
	public static void main(String[] args) {
		Person p = new Person("山田", 26);
		Student s = new Student("渡辺",18,12345,"日本");
		Teacher t = new Teacher("高橋",55,24001,"IT学科");
		Car c = new Car(5);
		
		Person t1 = new Teacher("山田",40,24011,"経営学科");
		Person s1=new Student("john smith",23,1234,"イギリス");
		
		p.printPerson();
        s.printStudent();
        t.printTeacher();
        c.print_Car();
        
        ((Teacher)t1).makeTest();
        
       p.work();
       t1.work();
       s1.work();
	}

}
