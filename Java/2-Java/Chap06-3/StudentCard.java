// P-177
public class StudentCard {
	static int counter = 0;
	int id;
    String name;
    
    StudentCard(int id, String name){
    	System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
    	
    	 this.id=id;
         this.name=name;
         StudentCard.counter++;
    }

}
