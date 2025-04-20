
class TestCard {
   int id;
    int score;


    public TestCard() {
        this.id = 0;
        this.score = 0;
    }


    public TestCard(int id, int score) {
        this.id = id;
        this.score = score;
    }


    public TestCard(int id) {
        this.id = id;
        this.score = 0;
    }

    public void display() {
        System.out.println("ID: " + id + ", 成績点: " + score);
    }
}

public class section_04 {
    public static void main(String[] args) {
    	
        TestCard student1 = new TestCard();
        TestCard student2 = new TestCard(24001, 100);
        TestCard student3 = new TestCard(24002);
        
        student1.display();
        student2.display();
        student3.display();
    }
}
