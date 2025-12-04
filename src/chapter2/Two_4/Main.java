package chapter2.Two_4;


public class Main {
    //TODO: static 클래스
    public static void main(String[] args) {
        System.out.println("현재 인구 수: " + Person.population);  ///클래스 변수이기 때문에 생성자 전에도 호출 가능

        Person p1 = new Person("김대훈");
        Person p2 = new Person("박철수");

        p1.printName();  ///인스턴스 메서드는 객체 인스턴스화 이후에 호출
        p2.printName();

        Person.printPopulation();  ///클래스 메서드는 클래스 이름으로 호출 가능

    }
}
