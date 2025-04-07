
public class Arugo05_02 {
	public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 60; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("10から60までの奇数の合計は: " + sum);
    }


}
