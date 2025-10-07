class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThreadのrunメソッド ➡ (" + i + ")");
        }
    }
}

public class List3_2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();            // Create an instance of MyThread
        Thread thread = new Thread(t);          // Wrap it into a Thread object
        thread.start();                         // Start the thread (calls run() method in MyThread)

        // Main thread loop
        for (int i = 0; i < 100; i++) {
            System.out.println("SimpleThreadTest2のmainメソッド ➡ (" + i + ")");
        }
    }
}