
/**
 * 全ての生徒の基本情報を持つ抽象スーパークラス
 */
public abstract class TSBStudent {
    // フィールド 
    String studentId;
    String name;

     //コンストラクタ
    public TSBStudent(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("------------------------------------");
        System.out.println("学籍番号 : " + this.studentId);
        System.out.println("氏名     : " + this.name);
    }

   //成績を評価し、結果を表示する抽象メソッド
    public abstract void gradeEvaluationShow();
    //合格したかどうかを判定する抽象メソッド.合格ならtrue, 不合格ならfalse
    public abstract boolean isPass();
    public abstract String getDepartment();
}