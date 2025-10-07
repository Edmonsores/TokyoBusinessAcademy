/*
 * インターフェースを型にした変数に
 * そのインターフェースを実装したクラスの
 * インスタンスを代入
 * implements キーワード
 */

//インターフェース宣言
interface HasGetAreaMethod {
    //インターフェースを実装するメソッド
    double getArea(); // 面積を返す
}

//抽象クラス定義
abstract class Shape {
    //フィールド
    int no;
    String name;

    //コンストラクタ


Shape(int in_no, String in_name) {
        this.no = in_no;
        this.name = in_name;
    }
    abstract void draw();
        void print() {
         System.out.println("番号：" +this.no);
         System.out.println("名前：" +this.name);
         
    }
}
class Rectangle extends Shape implements HasGetAreaMethod {
    Rectangle(int in_no, String in_name) {
        super(in_no, in_name);
        // TODO 自動生成されたコンストラクター・スタブ
    }

    void draw() {
        System.out.println("□");
    }

    public double getArea() {
        System.out.println("RectangleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}
class Circle extends Shape implements HasGetAreaMethod {
    Circle(int in_no, String in_name) {
        super(in_no, in_name);
        // TODO 自動生成されたコンストラクター・スタブ
    }

    void draw() {
        System.out.println("◯");
    }

    public double getArea() {
        System.out.println("CircleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Polyline extends Shape {
    int val;
    Polyline(int in_no, String in_name, int in_val) {
        super(in_no, in_name);
        this.val=in_val;
    }
    void draw() {
         System.out.println("N"+this.val);
    }
}
class Polygon extends Polyline implements HasGetAreaMethod {
    int hensu;

    Polygon(int in_no, String in_name, int in_v, int in_hensu) {
        super(in_no, in_name, in_v);
        this.hensu = in_hensu;
        // TODO 自動生成されたコンストラクター・スタブ
    }

    void draw() {
        System.out.println("凸" + this.hensu);
    }

    public double getArea() {
        System.out.println("PolygonクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}
public class List8_03_01 {
    public static void main(String[] args) {
        // インターフェース型のインスタンス生成
        HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3];
        closedShapes[0] = new Polygon(10, "takano", 123, 12);
        closedShapes[1] = new Rectangle(20, "yamada");
        closedShapes[2] = new Circle(30, "suzuki");

        for (int i = 0; i < 3; i++) {
            closedShapes[i].getArea();
        }

        for (int i = 0; i < 3; i++) {
            ((Shape) closedShapes[i]).draw();
        }
        for (int i = 0; i < 3; i++) {
            ((Shape) closedShapes[i]).print();
        }
    }
}
