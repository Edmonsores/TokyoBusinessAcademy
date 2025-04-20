import java.util.Scanner;
class TestCard{
	int studentnumber;
	int java;
	int python;
	boolean result;
	String r;
	
	public TestCard(int studentnumber, int java,int python) {
		this.studentnumber = studentnumber;
		this.java = java;
		this.python = python;
		this.result = false;
	}
	public void ResultMethod() {
		if(java >=60 && python >= 60) {
			result = true;
		}else {
			result = false;
		}
		if(result = true) {
			r = "合格";
		}else {
			r = "不合格";
		}
	}
	public void PrintMethod(){
		System.out.println("学籍番号："+ studentnumber);
		System.out.println("Javaの点数："+ java );
		System.out.println("Pythonの点数："+ python);
		System.out.println("合否："+ r);
        System.out.println("");
		
	}
}
public class section_05 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("学生1の学籍番号⇒");
	        int student1 = scanner.nextInt();
	        System.out.println("学生1のJavaの点数⇒");
	        int java1 = scanner.nextInt();
	        System.out.println("学生1のPythonの点数⇒");
	        int python1 = scanner.nextInt();
	        
	        System.out.println("学生2の学籍番号⇒");
	        int student2 = scanner.nextInt();
	        System.out.println("学生2のJavaの点数⇒");
	        int java2 = scanner.nextInt();
	        System.out.println("学生2のPythonの点数⇒");
	        int python2 = scanner.nextInt();
	        System.out.println("");
	        TestCard a = new TestCard(student1, java1, python1);
	        TestCard b = new TestCard(student2, java2, python2);
	        
	    	a.ResultMethod();
	    	b.ResultMethod();
	    	
	        System.out.println("学生1の結果：");
	        System.out.println("");
	    	a.PrintMethod();
	        System.out.println("学生2の結果：");
	        System.out.println("");
	    	b.PrintMethod();
	    	
	        scanner.close();
	   }
}
