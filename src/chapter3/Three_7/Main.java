package chapter3.Three_7;

public class Main {
    //TODO: 쓰레드
    public static void main(String[] args) {
        //멀티 쓰레드
        System.out.println("::: main 쓰레드 시작");

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

        // 시작시간 기록
        long startTime = System.currentTimeMillis();

        // 1. thread0 실행
        System.out.println("::: main 이 thread0 을 실행");
        thread0.start();  // 메서드 이름인 run 말고 start로 접근

        // 2. thread1 실행
        System.out.println("::: main 이 thread1 을 실행");
        thread1.start();

        System.out.println("::: main 쓰레드 종료");

        // ⌛️ main 쓰레드 대기 시키기
        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("총 작업 시간: " + totalTime + "ms");
        System.out.println("::: main 쓰레드 종료");

        //Runnable 인터페이스
        System.out.println("Runnable 인터페이스 사용 -----------------------------------------");
        MyRunnable task = new MyRunnable(); // ✅ 하나의 작업 객체 선언

        // ✅ 하나의 작업을 여러 쓰레드에서 공유
        Thread thread2 = new Thread(task); // 작업 객체 공유
        Thread thread3 = new Thread(task); // 작업 객체 공유

        // 실행
        thread2.start();
        thread3.start();

        //싱글 쓰레드
        //        System.out.println("::: main 쓰레드 시작 :::");
//        String threadName = Thread.currentThread().getName();
//
//        // ✅ 하나의 작업 단위: 숫자를 0 부터 9 까지 출력
//        for (int i = 0; i < 10; i++) {
//            System.out.println("현재 쓰레드: " + threadName + " - " + i);
//            try {
//                Thread.sleep(500); // 0.5 초 대기
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        // ✅ 추가작업
//        for (int i = 0; i < 10; i++) {
//            System.out.println("추가 작업 쓰레드: " + threadName + " - " + i);
//            try {
//                Thread.sleep(500); // 0.5 초 대기
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("::: 작업 끝 :::");
    }
}
