//P-178
public class List06_06 {
	public static void main(String[] args) {
		System.out.println("StudentCard.counter="+StudentCard.counter);
		
		StudentCard a = new StudentCard(12345, "鈴木太郎");
		System.out.println("StudentCard.counter="+StudentCard.counter);
		
    	StudentCard b = new StudentCard(12346, "佐藤花子");
    	System.out.println("StudentCard.counter="+StudentCard.counter);
	}

}
