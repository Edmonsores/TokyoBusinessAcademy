public class Section5_3 {
	public static void main(String[] args) {
	int num = 1568;
	int numcount = 0;
	while (num > 0) {
        num = num / 10;
        numcount++;
    }
	System.out.println("桁数は" + numcount + "桁です。");
	}
}
