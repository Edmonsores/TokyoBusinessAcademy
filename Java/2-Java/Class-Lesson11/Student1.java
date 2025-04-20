public class Student1 {
    static int memberId = 1000;
    static int blueCapCount = 0;

    int id;
    String name;
    int grade;  // 級（1～2, 3～5, 6～8）
    String capColor;  // (青、黄色、赤）
    int year;  // 学年（1～6）

    // コンストラクタ
    public Student1(String name, int grade, int year) {
        this.id = memberId++;
        this.name = name;
        this.grade = grade;
        this.year = year;
        this.capColor = "";  // 初期値は空白(Initial value is blank)
    }

    // 個人情報を表示するメソッド
    public void PrintMethod() {
        System.out.println("会員番号: " + id);
        System.out.println("名前: " + name);
        System.out.println("級: " + grade);
        System.out.println("キャップの色: " + capColor);
        System.out.println("学年: " + year);
        System.out.println();
    }

    // 級を判定してキャップの色を代入するメソッド
    public void assignCapColor() {
        if (grade >= 1 && grade <= 2) {
            this.capColor = "青";
            blueCapCount++;  // 青のキャップの人数を増やす(Increase the number of blue caps)
        } else if (grade >= 3 && grade <= 5) {
            this.capColor = "黄色";
        } else if (grade >= 6 && grade <= 8) {
            this.capColor = "赤";
        }
    }
}
