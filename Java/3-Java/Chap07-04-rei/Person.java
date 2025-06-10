
public class Person {
	String name;
	int age;
	Person(String in_name, int in_age){
		this.name=in_name;
		this.age=in_age;
	}
	void printPerson() {
		System.out.println("ーースーパークラス情報ーー");
		System.out.println("名前："+this.name);
		System.out.println("年齢："+this.age);
	}
	void work() {
		System.out.println("人間です。仕事します。");
	}

}
