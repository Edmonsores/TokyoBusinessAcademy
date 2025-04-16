
public class Mondai_05 {
	public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 10; i <= 1000; i++) {
            if (i % 4 == 0) {
                sum += i; 
                count++; 
            }
        }
        System.out.println("合計値: " + sum);
        System.out.println("4の倍数の数: " + count);
    }
}
