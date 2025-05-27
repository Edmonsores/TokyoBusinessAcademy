
/*
 * P-198 Sub class
 * p-199 追加プログラム
 * メソッドのオーバーライド
 */
public class IStudentCard extends StudentCard{
	String nationality;
	 void printInfo() {
		  System.out.println("学籍番号: " + this.id );
	      System.out.println("氏名: " + this.name);
	      System.out.println("国籍: " + this.nationality);
	 }

}
