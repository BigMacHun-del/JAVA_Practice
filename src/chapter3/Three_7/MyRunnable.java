package chapter3.Three_7;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드: " + threadName + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
