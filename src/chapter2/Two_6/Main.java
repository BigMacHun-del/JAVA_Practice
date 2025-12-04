package chapter2.Two_6;

public class Main {
    public static void main(String[] args) {
        //TODO: interface
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        luxuryCar.drive();
        luxuryCar.stop();
        luxuryCar.autoCharger();  // 인터페이스가 아닌 메서드도 가능

        speedCar.drive();
        speedCar.stop();
        speedCar.autoParking();
    }
}
