
public class List07_06 {
	public static void main(String [] args) {
		//インスタンス生成はサブクラス名
		StudentCard a = new StudentCard();
		a.id = 2345;
		a.name = "鈴木太郎";
		a.printInfo();
		
		IStudentCard b = new IStudentCard();
		b.id = 2345;
		b.name = "John Smith";
		b.nationality = "イギリス";
		b.printInfo();
	}

}
