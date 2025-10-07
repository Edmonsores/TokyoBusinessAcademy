class Circle extends Shape implements HasGetAreaMethod {
    double radius;

    public Circle(int shapeNumber, double radius) {
        super(shapeNumber, "円形"); // "Circle"
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("円の面積を求める計算式"); // "Formula for circle area"
        System.out.println("(" + radius + "×" + radius + ") × π");
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }
}
