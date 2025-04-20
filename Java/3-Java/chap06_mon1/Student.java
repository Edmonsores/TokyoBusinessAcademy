package chap06_mon1;

public class Student {
	static int counter = 1;
	int id;
	String name;

	Student(int id, String name){
		this.id = id;
		this.name =  name;
		Student.counter++;
	}
	
	System.out.println"()
	int getId() {
		return id;	
	}
	String getName() {
		return name;
	}
}
