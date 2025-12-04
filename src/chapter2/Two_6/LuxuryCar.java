package chapter2.Two_6;

public class LuxuryCar implements Car {
    // 인터페이스를 적용 시킬 때, 클래스 명에 빨간줄이 뜨는데, 커서를 올리고 alt + Enter자동 오버라이드한다.
    @Override
    public void drive() {
        System.out.println("Luxury car drive...");
    }

    @Override
    public void stop() {
        System.out.println("Luxury car stop...");
    }

    void autoCharger() {
        System.out.println("Luxury car autoCharger...");
    }

//    void move(){
//        System.out.println("Luxury car is moving");
//    }
//
//    void stop()  {
//        System.out.println("Luxury car is stopping");
//    }
}
