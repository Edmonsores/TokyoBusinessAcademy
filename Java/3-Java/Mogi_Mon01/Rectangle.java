class Rectangle extends Shape implements HasGetAreaMethod {
    double width;
    double height;

    public Rectangle(int shapeNumber, double width, double height) {
        super(shapeNumber, "四角形"); // "Rectangle"
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("四角形の面積を求める計算式"); // "Formula for rectangle area"
        System.out.println("面積=" + width + "×" + height); 
        // Print asterisks
        for (int i = 0; i < 4; i++) {
            System.out.println("******");
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }
}