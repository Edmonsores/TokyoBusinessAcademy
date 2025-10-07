class Shape {
    //クラス変数を変更出来ないようにfinal
    //変数名は大文字
    public final static double P1 = 3.1415926;
    public final static int ADULT = 20;

    //円の面積メソッド
    void Circle(double han) {
        double menseki = han * han * Shape.P1;
        System.out.println("円の面積：" + menseki);
    }

    //成人の年齢判定
    void ageprint(int tosi) {
        if (tosi >= Shape.ADULT) {
            System.out.println("ご成人おめでとうございます。"); 
        } else {
            System.out.println("まだ飲酒出来ません。"); 
        }
    }
}

public class List8_02 {
    public static void main(String[] args) {
        //インスタンス生成
        Shape f = new Shape();
        f.Circle(12.5);
        f.ageprint(21);
    }
}