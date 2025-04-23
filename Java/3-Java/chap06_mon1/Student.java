package chap06_mon1;

public class Student {
	static int counter = 1;
	int id;
	String name;

	Student(int id, String name){
		System.out.println("StudentCardクラスのコンストラクタが呼び出されます");
		this.id = id;
		this.name = name;
		Student.counter++;
	
	}
	 void printmethod() {
	        System.out.println("StudentCard情報");
	        System.out.println("番号: " + Student.counter);
	        System.out.println("学籍番号: " + this.id);
	        System.out.println("氏名: " + this.name);
	    }

}
