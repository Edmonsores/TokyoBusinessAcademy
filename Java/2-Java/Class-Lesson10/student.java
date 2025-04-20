public class student {
    // クラス変数(Class Variables)
    static int totalScore = 0;
    static int studentCount = 0;
    static double averageScore = 0.0;
    
    // フィールド変数(Field Variables)
    int id;
    String name;
    int score;
    
    // コンストラクタ(constructor)
    public student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
        totalScore += score;
        averageScore = (double) totalScore / studentCount;
    }
    
    // クラスメソッド：平均点を求める
    public static double AverageScore() {
        return averageScore;
    }
    
    // クラスメソッド：平均点以上の人数を求める
    public static int AboveAverage(student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].score >= averageScore) {
                count++;
            }
        }
        return count;
    }
    
    // 学生情報を表示するメソッド
    public void PrintMethod() {
        System.out.println("学籍番号: " + id + ", 氏名: " + name + ", 成績点: " + score);
    }
    
    public int getScore() {
        return this.score;
    }
}

