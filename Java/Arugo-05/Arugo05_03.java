
public class Arugo05_03 {
	public static void main(String[] args) {
	   int sum = 0;
	   int n = 3;
	     while (sum < 100) {
	       if (n % 4 == 0) {
	         sum += n;
	       }
	       n++;
	       }
	   System.out.println("合計値が100以上になるまでの4の倍数の合計: " + sum);
	}
}

