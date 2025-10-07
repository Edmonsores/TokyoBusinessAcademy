import java.util.Arrays;
public class math_03 {
	public static void main(String[] args) {
		int[] numbers = {5, 12, 8, 21, 7};
		
		int max = Arrays.stream(numbers).max().orElseThrow();
		System.out.println("配列内の最大値は："+ max);
		
		int min = Arrays.stream(numbers).min().orElseThrow();
		System.out.println("配列内の最小値は："+ min);
	}
}
