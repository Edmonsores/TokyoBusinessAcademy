class Triangle extends Shape implements AreaMethod {
    private double base;
    private double height;

    public Triangle(int shapeId, double base, double height) {
        super(shapeId, "三角形");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void drawMethod() {
        System.out.println("三角形を描画する");
    }
}