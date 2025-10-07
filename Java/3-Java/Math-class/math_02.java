
public class math_02 {
	public static void main(String[] args) {
		int[] numbers = {5, 12, 8, 21, 7};
		int max = numbers[0];
		
		for (int num : numbers) {
			max = Math.max(max,  num);
		}
		
		System.out.println("配列内の最大値は："+ max);
		
		int mi = numbers[0];
		for (int num : numbers) {
			max = Math.min(mi,  num);
		}
		System.out.println("配列内の最小値は："+ max);
	}

}
