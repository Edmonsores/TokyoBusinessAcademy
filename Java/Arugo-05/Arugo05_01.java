
public class Arugo05_01 {
	    public static void main(String[] args) {
	        int sum = 0;
	        double avg;
	        for (int i = 1; i <= 50; i++) {
	            sum += i;
	        }
	        avg = (double) sum / 50;
	        System.out.println("合計値: " + sum);
	        System.out.println("平均値: " + avg);
	    }
	}
