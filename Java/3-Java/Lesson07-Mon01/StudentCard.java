
public class StudentCard {
	 int id;
	 String name;
	 
	 public StudentCard(int in_id, String in_name) {
		 this.id = in_id;
		 this.name = in_name;
	 }
	 
	 void printInfo() {
		  System.out.println("学籍番号: " + this.id );
	      System.out.println("氏名: " + this.name);
	 }

}
