
public class List7_9 {
	public static void main(String[] args) {
	    Person[] persons=new Person[3];
	    persons[0]=new Person("山中",55);
	    persons[1]=new Student("後原",23,1234,"日本");
	    persons[2]=new Teacher("森田",23,24011,"経営");
	    
	    for(int i=0;i<persons.length;i++) {
	        if(persons[i] instanceof Person) {
	            System.out.println("Persons["+i+"]はPersonクラスのいんすたんすです");
	        }
	        if(persons[i] instanceof Student) {
	            System.out.println("Persons["+i+"]はStudentクラスのいんすたんすです");
	        }
	        if(persons[i] instanceof Teacher) {
	            System.out.println("Persons["+i+"]はTeacherクラスのいんすたんすです");
	        }
	    }
	    
	}

}
