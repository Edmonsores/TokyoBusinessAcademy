interface SayHello2{
    public void hello();
}
 class Greeting2 {
        static void greet (SayHello2 s) {
            s.hello();
        }
    }
public class List06_04 {
    public static void main(String[] args) {
        Greeting2.greet(new SayHello2() {
        public void hello() {
                System.out.println("こんにちは");
        }
    });
}
}