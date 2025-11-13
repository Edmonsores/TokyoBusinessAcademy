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
public class List06_06_forEach {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<Point>();
        pointList.add(new Point(0, 8));
        pointList.add(new Point(1, 6));
        pointList.add(new Point(2, 9));
        pointList.add(new Point(3, 3));

        // forEachメソッドとラムダ式を使用
        // xとyの値を2倍にする
        pointList.forEach(p -> {p.x *= 2; p.y *= 2;});
        pointList.forEach(p -> p.printInfo());

        // sortメソッドを使用しラムダ式で記述 P-141
        // XとYの足した値を昇順に並べ替える
        pointList.sort((p0, p1) -> (p0.x + p0.y)-(p1.x+p1.y));
        pointList.forEach(p -> p.printInfo());
    }
}
