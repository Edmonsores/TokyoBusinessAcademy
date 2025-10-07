// List 3-6 03-06/MultiThreadExample
class Bank {
    // Bank (銀行) クラスです
    // クラス変数 money の初期値は 0 です
    static int money = 0;

    // money の値を 1 増やすメソッドです
    static synchronized void addOneYen() {
        money++;
    }
}

// Customer (顧客) クラスです
// Thread クラスを継承します
class Customer extends Thread {
    public void run() {
        // Bank クラスの addOneYen
        // メソッドを 1 万回実行します
        for (int i = 0; i < 10000; i++) {
            Bank.addOneYen();
        }
    }
}

public class List3_6 {
    public static void main(String[] args) {
        Customer[] customers = new Customer[100];

        // Customer オブジェクトを
        // 100 個作り、それぞ
        // れのスレッドを開始します
        for (int i = 0; i < 100; i++) {
            customers[i] = new Customer();
            customers[i].start();
        }

        for (int i = 0; i < 100; i++) {
            try {
                // すべてのスレッド
                // が終了するのを
                // 待ちます
                customers[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // 最後に Bank クラスの
        // money の値を出力します
        System.out.println(Bank.money);
    }
}