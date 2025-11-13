/*
 * P-136 ラムダ式の省略形を使ったプログラム
 */
// 関数型インターフェース
interface SimpleInterface {
    // メソッドが1つである
    public int doSomething(int n);
}

public class List06_05 {
    // 引数が関数型インターフェースなのでラムダ式を受け取る
    static void printout(SimpleInterface i) {
        System.out.println(i.doSomething(2));
    }

    public static void main(String[] args) {
        // ラムダ式記述
        printout(n -> n + 1);
    }
}