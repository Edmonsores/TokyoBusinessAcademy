public class List3_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // 1000 milliseconds (1 second) stop
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print("*");
        }
        System.out.println(); // Add a newline after the loop finishes
    }
}