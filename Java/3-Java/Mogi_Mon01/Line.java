class Line extends Shape implements HasGetAreaMethod {

    public Line(int shapeNumber) {
        super(shapeNumber, "直線"); // "Line"
    }

    @Override
    public void draw() {
        System.out.println("直線を描く");
        System.out.println("ーーーーーーーーーー"); // "Draw a line"
    }

    @Override
    public double getArea() {
        //No area
        return 0.0;
    }
}