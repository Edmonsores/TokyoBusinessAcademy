import java.util.Scanner;
public class Les07_01 {
	public static void main(String [] args) {
		 Scanner scanner = new Scanner(System.in);
	      System.out.println("学生情報を入力してください。");
	        System.out.print("学籍番号（4桁）：");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("氏名：");
	        String name = scanner.nextLine();

	        System.out.print("学科名：");
	        String department = scanner.nextLine();

	        System.out.print("国籍：");
	        String nationality = scanner.nextLine();

	        Itstudent student = new Itstudent(id, name, department, nationality);
	        student.printInfo();

	        scanner.close();
		
		
	}

}
