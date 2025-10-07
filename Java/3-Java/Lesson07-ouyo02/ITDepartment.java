public class ITDepartment extends TSBStudent {

    int algorithm;
    int java;
    int web;

    //コンストラクタ
    public ITDepartment(String studentId, String name, int algorithm, int java, int web) {
        // スーパークラスのコンストラクタを呼び出す
        super(studentId, name);
        this.algorithm = algorithm;
        this.java = java;
        this.web = web;
    }
   // 成績評価と結果表示 (オーバーライド)
    @Override
    public void gradeEvaluationShow() {
        // 親クラスのメソッドで基本情報を表示
        displayInfo();
        System.out.println("IT学科 成績");
        System.out.println("アルゴリズム: " + this.algorithm + "点");
        System.out.println("JAVA: " + this.java + "点");
        System.out.println("WEB: " + this.web + "点");
        
        int total = this.algorithm + this.java + this.web;
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
        return this.algorithm >= 60 && this.java >= 60 && this.web >= 60;
    }
    @Override
    public String getDepartment() {
        return "IT";
    }
}
