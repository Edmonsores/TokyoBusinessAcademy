
public class Section5_2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            if (sum > 100) {
                System.out.println("合計が100を超えた最後の整数: " + i);
                System.out.println("合計: " + sum);
                break;
            }
	    }
    }
}
