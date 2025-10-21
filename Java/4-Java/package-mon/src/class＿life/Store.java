package class＿life;

public class Store {
    private int shopNumber;
    private String shopName;
    private double sales;
    private double target;
    private double achievementRate;

    // コンストラクタ
    public Store(int shopNumber, String shopName, double sales, double target) {
        this.shopNumber = shopNumber;
        this.shopName = shopName;
        this.sales = sales;
        this.target = target;
        this.achievementRate = 0.0;
    }

    // ①達成率を計算して％表示するメソッド
    public void calculateAchievementRate() {
        if (target != 0) {
            achievementRate = (sales / target) * 100;
        } else {
            achievementRate = 0.0;
        }
        System.out.printf("店番%d（%s）の達成率：%.2f%%\n", shopNumber, shopName, achievementRate);
    }

    // ②達成率を評価して表示するメソッド
    public void evaluateAchievement() {
        String result;
        if (achievementRate >= 100) {
            result = "優秀";
        } else if (achievementRate >= 80) {
            result = "良好";
        } else if (achievementRate >= 50) {
            result = "頑張りましょう";
        } else {
            result = "問題有り";
        }

        System.out.printf("店番%d（%s）の評価：%s\n", shopNumber, shopName, result);
    }

    // ③全てのフィールドを表示するメソッド
    public void displayAll() {
        System.out.println("店番: " + shopNumber);
        System.out.println("店名: " + shopName);
        System.out.println("売上額: " + sales);
        System.out.println("目標額: " + target);
        System.out.printf("達成率: %.2f%%\n", achievementRate);
        System.out.println("-----------------------------");
    }
}
