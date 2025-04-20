class StudentCard {
    String name; 
    int id;  
}
public class List05_05 {
	  // Method to print the instance variable values
    static void printCardInfo(StudentCard card) {
        System.out.println("学籍番号: " + card.id);
        System.out.println("氏名: " + card.name);
    }

    // Method to clear instance variable values
    static void clearCardInfo(StudentCard card) {
        card.id = 0;
        card.name = "未定"; // Resetting name to null
    }

    public static void main(String[] args) {

        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木太郎";

        // Print the initial information
        printCardInfo(a);

        // Clear the card information
        clearCardInfo(a);

        // Print the cleared information
        printCardInfo(a);
    }
}


