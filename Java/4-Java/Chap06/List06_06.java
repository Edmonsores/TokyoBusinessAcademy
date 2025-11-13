/*
 * P-138 イテレータを用いる方法と拡張for文
 */
import java.util.ArrayList;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printInfo() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
public class List06_06 {
    public static void main(String[] args) {
        // Pointオブジェクトを格納するためのArrayListオブジェクトを生成
        ArrayList<Point> pointList = new ArrayList<Point>();

        // ArrayListに4つのPointオブジェクトを格納
        pointList.add(new Point(0, 8));
        pointList.add(new Point(1, 6));
        pointList.add(new Point(2, 9));
        pointList.add(new Point(3, 3));

        // 要素に1つずつアクセス
        for (Point p : pointList) {
            // Pointオブジェクトのxとyの値を2倍にする
            p.x *= 2;
            p.y *= 2;
        }

        // 要素に1つずつアクセス
        for (Point p : pointList) {
            p.printInfo();
}
}
}