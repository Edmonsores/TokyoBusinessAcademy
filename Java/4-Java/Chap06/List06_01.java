class Outer{
    private String message="Outerクラスのprivateなインスタンス変数です";
    
    void doSomething() {
        class Inner{
            void print() {
        System.out.println("Innerクラスのprintメソッドが呼びます");
        System.out.println(message);
    }
}
Inner inner=new Inner();
inner.print();
}
}
public class List06_01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doSomething();
    }
}
