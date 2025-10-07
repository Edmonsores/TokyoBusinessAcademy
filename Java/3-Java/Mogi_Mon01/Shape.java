abstract class Shape {
    int shapeNumber;
    String shapeName;

    public Shape(int shapeNumber, String shapeName) {
        this.shapeNumber = shapeNumber;
        this.shapeName = shapeName;
    }

    public int getShapeNumber() {
        return shapeNumber;
    }

    public String getShapeName() {
        return shapeName;
    }

    public abstract void draw();
}