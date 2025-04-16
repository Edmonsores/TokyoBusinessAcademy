
public class Mondai_04 {
	public static void main(String[] args) {
        int T = 1000;
        int W = 45;

        int quotient = 0;
        int remainder = T;
        
        for (int i = 0; remainder >= W; i++) {
            remainder -= W;
            quotient++;
        }
        System.out.println("商: " + quotient);
        System.out.println("余り: " + remainder);
    }
}