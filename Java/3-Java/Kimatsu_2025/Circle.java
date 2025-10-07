class Circle extends Shape implements AreaMethod {
    private double radius;
    private final double PI = 3.14;

    public Circle(int shapeId, double radius) {
        super(shapeId, "円形");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void drawMethod() {
        System.out.println("円形を描画する");
    }
}