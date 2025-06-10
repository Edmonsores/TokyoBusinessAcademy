
public class Student extends Person {
	int gakuseki;
	String nationality;
	Student(String in_na, int in_age, int in_ga, String in_natio){
		super(in_na, in_age);
		this.gakuseki=in_ga;
		this.nationality=in_natio;
	}
	void printStudent() {
		System.out.println("ーー生徒情報ーー");
		super.printPerson();
		System.out.println("学籍番号："+this.gakuseki);
		System.out.println("国籍："+this.nationality);
	}

	void work() {
		System.out.println("学生です。勉強します。");
	}

}
