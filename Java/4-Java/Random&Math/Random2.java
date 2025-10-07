import java.util.Random;

public class Random2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;

        System.out.print("サイコロの出目: ");
        for (int i = 0; i < 10; i++) {
            int dice = rand.nextInt(6) + 1; // 1～6
            sum += dice;
            System.out.print(dice + " ");
        }

        System.out.println("\n10回ふった合計 = " + sum);
    }
}
