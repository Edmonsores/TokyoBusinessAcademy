
public class OfficeDepartment extends TSBStudent {
    int word;
    int excel;

    //コンストラクタ
    public OfficeDepartment(String studentId, String name, int word, int excel) {
        // スーパークラスのコンストラクタを呼び出す
        super(studentId, name);
        this.word = word;
        this.excel = excel;
    }

    // 成績評価と結果表示 (オーバーライド)
    @Override
    public void gradeEvaluationShow() {
        // 親クラスのメソッドで基本情報を表示
        displayInfo();
        System.out.println("オフィス学科 成績");
        System.out.println("Word : " + this.word + "点");
        System.out.println("Excel: " + this.excel + "点");

        int total = this.word + this.excel;
        System.out.println("合計: " + total + "点");

        if (isPass()) {
            System.out.println("評価: 合格");
        } else {
            System.out.println("評価: 不合格");
        }
        System.out.println("------------------------------------");
    }

    //全ての科目が60点以上であれば合格
    @Override
    public boolean isPass() {
        return this.word >= 60 && this.excel >= 60;
    }
    @Override
    public String getDepartment() {
        return "Office";
    }
}