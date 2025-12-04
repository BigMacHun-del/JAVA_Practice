package chapter2.Two_6;

public class SpeedCar implements Car {
    @Override
    public void drive() {
        System.out.println("SpeedCar drive...");
    }

    @Override
    public void stop() {
        System.out.println("SpeedCar stop...");
    }

    void autoParking() {
        System.out.println("SpeedCar autoParking...");
    }

//    void drive() {
//        System.out.println("Luxury car is driving");
//    }
}
