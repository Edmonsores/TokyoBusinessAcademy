class Polygon extends Shape implements AreaMethod {
    private double upperBase;
    private double lowerBase;
    private double height;

    public Polygon(int shapeId, double upperBase, double lowerBase, double height) {
        super(shapeId, "四角形");
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2;
    }

    @Override
    public void drawMethod() {
        System.out.println("台形を描画する");
    }
}