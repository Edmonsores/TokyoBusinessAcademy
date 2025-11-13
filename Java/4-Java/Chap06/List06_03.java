interface SayHello1{
    public void hello();
}
 class Greeting1 {
        static void greet (SayHello1 s) {
            s.hello();
        }
    }
public class List06_03 {
    public static void main(String[] args) {
        class Person implements SayHello1{
            public void hello() {
                System.out.println("こんにちは");
            }
        }
        Person p = new Person();
        Greeting1.greet(p);
    }
}