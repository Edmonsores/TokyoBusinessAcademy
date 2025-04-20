import java.util.Scanner;
public class Section8_01 {


    public static double Max(double a, double b, double c) {
        double max = a;

        if (b > max) {
            max = b; 
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] heights = new double[3];
        double[] weights = new double[3];
        int[] ages = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("人" + (i + 1) + "の身長を入力してください:");
            heights[i] = scanner.nextDouble();
            System.out.println("人" + (i + 1) + "の体重を入力してください:");
            weights[i] = scanner.nextDouble();
            System.out.println("人" + (i + 1) + "の年齢を入力してください:");
            ages[i] = scanner.nextInt();
        }

        double maxHeight = Max(heights[0], heights[1], heights[2]);
        double maxWeight = Max(weights[0], weights[1], weights[2]);
        int maxAge = (int) Max(ages[0], ages[1], ages[2]);


        System.out.println("最大身長: " + maxHeight);
        System.out.println("最大体重: " + maxWeight);
        System.out.println("最大年齢: " + maxAge);

        scanner.close();
    }
}
