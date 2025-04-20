import java.util.Scanner;
public class List06_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("三角形の底辺⇒");
        double base = scanner.nextDouble();
        System.out.println("三角形の高さ⇒");
        double height = scanner.nextDouble();

        SimpleCalc calc = new SimpleCalc(base, height);
        calc.printArea();

        scanner.close();
	}
}
