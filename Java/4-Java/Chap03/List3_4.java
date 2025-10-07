class MyThread4 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThreadのrunメソッド ➡ (" + i + ")");
        }
    }
}

public class List3_4 {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.start();

        try {
            t.join(); // スレッドtの処理が終わるのを待ちます (Wait for thread t to finish its processing)
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("SimpleThreadTest3クラスのmainメソッド ➡ (" + i + ")");
        }
    }
}