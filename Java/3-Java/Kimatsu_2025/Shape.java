public abstract class Shape {
    protected int shapeId;
    protected String shapeName;

    public Shape(int shapeId, String shapeName) {
        this.shapeId = shapeId;
        this.shapeName = shapeName;
    }

    public void printMethod() {
        System.out.println("図形番号: " + shapeId + ", 図形名: " + shapeName);
    }

    // Abstract drawMethod as shown in the diagram
    public abstract void drawMethod();
}