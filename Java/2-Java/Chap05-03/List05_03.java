class Studentcard{
	int id;
	String name;
}
public class List05_03 {

	    public static void main(String[] args) {

	    	Studentcard[] cards=new Studentcard[3];

	    	cards[0]=new Studentcard();
	    	cards[0].id=1234;
	    	cards[0].name="EDGARD";

	    	cards[1]=new Studentcard();
	    	cards[1].id=1235;
	    	cards[1].name="AKHIL";

	    	cards[2]=new Studentcard();
	    	cards[2].id=1236;
	    	cards[2].name="SANJID";

	    	for(int i=0;i<3;i++) {
	    		System.out.println("cards[" +i+ "]の" +"idは"+cards[i].id+",nameは"+cards[i].name);
	    	}
	    }
}
