public class kimatu {
    public static void main(String[] args) {
        System.out.println("<実行結果>");

        // 1: Polyline (直線)
        Polyline polyline = new Polyline(1);
        System.out.println("-----番号: 1-----");
        System.out.println("図形の形: 直線");
        System.out.println("高さと幅が同じ直角三角形を描く");
        System.out.println("高さ: 7");
        drawTriangles(7);    // △で三角形を描画
        drawPolyline(10);    // --- を直線で描画

        // 2: Circle (円形)
        Circle circle = new Circle(2, 4.5);
        System.out.println("-----番号: 2-----");
        System.out.println("図形の形: 円形");
        System.out.println("円の面積を求める計算式: (4.5 * 4.5) * 3.14");
        System.out.println("面積: " + circle.getArea());

        // 3: Rectangle (四角形)
        Rectangle rectangle = new Rectangle(3, 6, 4); // width=6, height=4
        System.out.println("-----番号: 3-----");
        System.out.println("図形の形: 四角形");
        System.out.println("四角形の計算式: 6 * 4");
        System.out.println("面積: " + rectangle.getArea());
        drawRectangle(6, 4); // □で四角形を描画

        // 4: Polygon (台形)
        Polygon polygon = new Polygon(4, 4.5, 5.5, 9);
        System.out.println("-----番号: 4-----");
        System.out.println("図形の形: 台形");
        System.out.println("台形の上底 -> 4.5");
        System.out.println("台形の下底 -> 5.5");
        System.out.println("台形の高さ -> 9");
        System.out.println("台形の計算式: (4.5 + 5.5) * 9 / 2");
        System.out.println("面積: " + polygon.getArea());

        // 5: Triangle (三角形)
        Triangle triangle = new Triangle(5, 4, 6);
        System.out.println("-----番号: 5-----");
        System.out.println("図形の形: 三角形");
        System.out.println("底: 4");
        System.out.println("縦: 6");
        System.out.println("三角形の計算式: 4 * 6 / 2");
        System.out.println("面積: " + triangle.getArea());
        drawTriangles(7);   // △で三角形を描画
    }

    // △で階段状の三角形を描く
    public static void drawTriangles(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("△");
            }
            System.out.println();
        }
    }

    // □で矩形を描く
    public static void drawRectangle(int width, int height) {
        System.out.println("□で四角形を描く:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("□");
            }
            System.out.println();
        }
    }

    // --- で直線を描く
    public static void drawPolyline(int count) {
        System.out.println("直線を" + count + "個描く");
        for (int i = 0; i < count; i++) {
            System.out.print("---");
        }
        System.out.println();
    }
}
