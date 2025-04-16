public class Section3_5 {
	public static void main(String[] args) {
        int ageA = 65;
        int ageB = 25;
        int ageC = 12;
        int ageD = 3;
        int ageE = 40;

        int feeA = calculateFee(ageA);
        int feeB = calculateFee(ageB);
        int feeC = calculateFee(ageC);
        int feeD = calculateFee(ageD);
        int feeE = calculateFee(ageE);

        int totalFee = feeA + feeB + feeC + feeD + feeE;

        System.out.println("5人分の入園料は" + totalFee + "円");
    }

    public static int calculateFee(int age) {
        if (age > 60) {
            return 300;
        } else if (age > 20) {
            return 1000;
        } else if (age > 5) {
            return 500;
        } else {
            return 0;
        }
    }

}
