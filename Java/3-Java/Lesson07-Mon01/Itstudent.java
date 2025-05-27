public class Itstudent extends StudentCard{
	String nationality;
	String department;
	
	   public Itstudent(int in_id, String in_name, String in_department, String in_nationality) {
	        super(in_id, in_name);
	        this.department = in_department;
	        this.nationality = in_nationality;
	    }

	    public void printInfo() {
	        System.out.println("ーーー 学生情報 ーーー");
	        System.out.println("学科名：" + department);
	        super.printInfo();
	        System.out.println("国籍：" + nationality);
	    }
}
