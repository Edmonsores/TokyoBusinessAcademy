public class IStudentCard extends StudentCard {
	String nationality;
	 void printInfo() {
		  super.printInfo();//super class
	      System.out.println("国籍: " + this.nationality);
	 }

}
