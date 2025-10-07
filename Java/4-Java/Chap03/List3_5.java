class MyThread5 extends Thread {
    public boolean running = true; // 処理を繰り返す条件式です。外部から値を変更できるようにpublicにします。

    public void run() {
        while (running) { // runningの値がtrueの間、[＊]を出力し続けます
            System.out.print("*");
        }
        System.out.println("runメソッドを終了します");
    }
}

public class List3_5 {
    public static void main(String[] args) {
        MyThread5 t = new MyThread5();
        t.start();

        try {
            Thread.sleep(5); // 5ミリ秒待ちします
        } catch (Exception e) {
            System.out.println(e);
        }

        t.running = false; // runningの値をfalseにすることで、スレッドのrunメソッド内の繰り返し処理が終了します
    }
}