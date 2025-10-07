public class Mogi_2025 {
    public static void main(String[] args) {

        //Line
        System.out.println("----- 番号：1 -----");
        Line line = new Line(1);
        System.out.println("図形の形：" + line.getShapeName());
        line.draw();

        //Circle
        System.out.println("----- 番号：2 -----");
        Circle circle = new Circle(2, 2.5);
        System.out.println("図形の形：" + circle.getShapeName());
        circle.draw();
        System.out.println("面積：" + circle.getArea());

        //Rectangle
        System.out.println("----- 番号：3 -----");
        Rectangle rectangle = new Rectangle(3, 4.0, 6.0);
        System.out.println("図形の形：" + rectangle.getShapeName());
        rectangle.draw();
        System.out.println("面積：" + rectangle.getArea());

        //Trapezoid
        System.out.println("----- 番号：4 -----");
        Trapezoid trapezoid = new Trapezoid(4, 6.0, 10.0, 5.0);
        System.out.println("図形の形：" + trapezoid.getShapeName());
        trapezoid.draw();
        System.out.println("面積：" + trapezoid.getArea());
    }
}