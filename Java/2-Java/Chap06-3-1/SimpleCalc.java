//P-181
public class SimpleCalc {
	
    static double area;
    double base;
    double height;

    public SimpleCalc(double base, double height) {
        this.base = base;
        this.height = height;

    }
    
    public double getArea() {
        return 0.5 * base * height;
    }
    
    void printArea() {
    	System.out.println("底辺が"+base+"、高さが"+height+"の三角形の面積は" + getArea());
    }
}
