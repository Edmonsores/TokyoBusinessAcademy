import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int luckyNumber = rand.nextInt(50) + 1; // 1～50
        System.out.println("今日のラッキーナンバーは: " + luckyNumber);
    }
}
