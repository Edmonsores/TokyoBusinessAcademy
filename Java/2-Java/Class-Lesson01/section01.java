class Studentcard{
	String name;
	int height;
	int weight;
}
public class section01 {
	    public static void main(String[] args) {
	    	Studentcard a = new Studentcard();
			a.name = "Edgard";
			a.height = 175;
			a.weight = 60;
			
			Studentcard b = new Studentcard();
			b.name = "鈴木次郎";
			b.height = 170;
			b.weight = 66;
			
	        System.out.println("名前: " + a.name);
	        System.out.println("身長: " + a.height + " cm");
	        System.out.println("体重: " + a.weight + " kg");
	        System.out.println(" ");
	        System.out.println("名前: " + b.name);
	        System.out.println("身長: " + b.height + " cm");
	        System.out.println("体重: " + b.weight + " kg");
	    }
}

