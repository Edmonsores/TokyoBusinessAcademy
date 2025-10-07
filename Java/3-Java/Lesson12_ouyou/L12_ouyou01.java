// ウエアラブルインタフェース
interface Wearable {
    void putOn();  // 着る
    void putOff(); // 脱ぐ
}

// 着色インタフェース
interface Colorable {
    int RED = 1;    // 赤
    int GREEN = 2;  // 緑
    int BLUE = 3;   // 青

    void changeColor(int color);
}

// ---- ウエアラブルコンピュータ クラス ---- //
class WearableComputer implements Wearable {
    private String name;

    // コンストラクタ
    WearableComputer(String name) {
        this.name = name;  // ← 修正！(元コードは引数が neme で、代入が name になっていた)
    }

    // putOn実装
    public void putOn() {
        System.out.println(name + "ON!!");
    }

    // putOff実装
    public void putOff() {
        System.out.println(name + "OFF!!");
    }
}

// ---- 着色可能なウエアラブルロボット クラス ---- //
class WearableRobot implements Wearable, Colorable {
    private int color;

    // コンストラクタ
    WearableRobot(int color) {
        changeColor(color);
    }

    // 色を変更
    public void changeColor(int color) {
        this.color = color;
    }

    // 色に応じた文字列
    public String toString() {
        switch (color) {
            case RED:
                return "赤ロボット";
            case GREEN:
                return "緑ロボット";
            case BLUE:
                return "青ロボット";
        }
        return "ロボット";
    }

    // putOn実装
    public void putOn() {
        System.out.println(toString() + "装着！！");
    }

    // putOff実装
    public void putOff() {
        System.out.println(toString() + "解除！！");
    }
}

// メインクラス
public class L12_ouyou01 {
    public static void main(String[] args) {
        // 配列作成
        Wearable[] w = {
            new WearableComputer("HAL"),
            new WearableRobot(Colorable.RED),
            new WearableRobot(Colorable.GREEN),
        };

        // ループ実行
        for (Wearable k : w) {
            k.putOn();
            k.putOff();
            System.out.println();
        }
    }
}
