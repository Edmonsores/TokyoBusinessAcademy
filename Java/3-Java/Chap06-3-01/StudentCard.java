
public class StudentCard {
	    static int counter = 0; // counter番号を管理するクラス変数 Class variable that manages the counter number
	    static int totalScore = 0; // 合計点を格納するクラス変数 Class variable to store the total score
	    int counterNumber;
	    String studentId;
	    String name;
	    int score; // 成績点を格納するフィールド Field that stores grade points

	    // コンストラクタ
	    public StudentCard(String studentId, String name, int score) {
	        this.counterNumber = counter++;
	        this.studentId = studentId;
	        this.name = name;
	        this.score = score;
	        totalScore += score;
	    }
	    
	    // counter番号、学籍番号、氏名を表示するインスタンスメソッド 
	    //Instance method to display the counter number, student ID number, and name
	    public void displayInfo() {
	        System.out.println("番号: " + this.counterNumber);
	        System.out.println("学籍番号: " + this.studentId );
	        System.out.println("氏名: " + this.name);
	    }
	    
	    // 成績点を取得するインスタンスメソッド
	    //Instance method to get the grades
	    public int getScore() {
	        return this.score;
	    }
	    
	    // 三人の成績点の合計を求めるクラスメソッド
	    //Class method to calculate the total score of three students
	    public static int calculateTotalScore(StudentCard[] cards) {
	        int totalScore = 0; // 合計を初期化 Initialize Total
	        for (int i = 0; i < cards.length; i++) {
	            totalScore += cards[i].getScore(); // 各カードのスコアを加算 Add up the score for each card
	        }
	        return totalScore;
	    }

	    // 合計点を取得するクラスメソッド
	    //Class method to get the total score
	    public static int getTotalScore() {
	        return totalScore;
	    }
	}


