
public class Teacher extends Person {
	int syainNo;
	String ga_name;
	Teacher(String in_na, int in_age, int in_no, String in_ga){
		super(in_na, in_age);
		this.syainNo=in_no;
		this.ga_name=in_ga;
	}
	void printTeacher() {
		System.out.println("ーー先生情報ーー");
		super.printPerson();
		System.out.println("社員番号："+this.syainNo);
		System.out.println("学科名："+this.ga_name);
	}
	void work() {
		System.out.println("教員です。授業をします。");
	}
	void makeTest() {
        System.out.println("試験問題を作ります");
    }
}
