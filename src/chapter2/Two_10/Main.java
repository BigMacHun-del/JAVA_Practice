package chapter2.Two_10;

public class Main {
    //TODO: 다형성(업 캐스팅, 다운 캐스팅)
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.exist();
        animal.makeSound();

        // 사용불가 - 다운캐스팅 필요
        // animal.scratch();

        // 다운캐스팅
        Cat cat = (Cat) animal;
        cat.scratch();

        // 다운캐스팅 주의사항
        Animal animal2 = new Dog();

        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
            cat2.scratch();
        } else {
            System.out.println("고양이 객체가 아닙니다!");
        }
        //cat2.scratch(); 에러발생!! ClassCastException
    }
}
