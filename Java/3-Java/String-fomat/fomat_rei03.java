import java.util.Arrays;
public class fomat_rei03 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		String formattedString=String.format("配列の要素: %s", Arrays.toString(numbers));
		System.out.println(formattedString);
	}

}
