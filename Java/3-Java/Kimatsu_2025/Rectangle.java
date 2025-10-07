class Rectangle extends Shape implements AreaMethod {
    private double width;
    private double height;

    public Rectangle(int shapeId, double width, double height) {
        super(shapeId, "長方形");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void drawMethod() {
        System.out.println("長方形を描画する");
    }
}