class Trapezoid extends Shape implements HasGetAreaMethod {
    double base1;
    double base2;
    double height;

    public Trapezoid(int shapeNumber, double base1, double base2, double height) {
        super(shapeNumber, "台形"); // "Trapezoid"
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("台形の計算式"); // "Trapezoid calculation formula"
        System.out.println("(" + base1 + "+" + base2 + ") ÷ 2 × " + height);
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }
}