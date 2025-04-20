class Studentcardy{
	int id;
	String name;
}
public class List05_04 {
	    public static void main(String[] args) {

	    	Studentcardy[] cards=new Studentcardy[3];

	    	cards[1]=new Studentcardy();
	    	cards[1].id=1235;
	    	cards[1].name="EDGARD";

	    	for(int i=0;i<3;i++) {
	    		if (cards[i]==null) {
	    		System.out.println("cards[" +i+ "]参照がありません");
	    	    }else {
	    		System.out.println("cards[" +i+ "]の" +"idは"+cards[i].id+",nameは"+cards[i].name);
	    	    }
            }
         }       
}