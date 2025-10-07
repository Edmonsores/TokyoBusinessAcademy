class Polyline extends Shape {
    public Polyline(int shapeId) {
        super(shapeId, "直線");
    }

    @Override
    public void drawMethod() {
        System.out.println("直線を描画する");
    }
}