package chapter2.Two_4;

public class Person {
    static int population = 0;  ///클래스(static) 변수 heap이 아니라 Method Area에 저장 됨
    String name;

    public Person(String name) {
        this.name = name;
        population++;
    }

    public void printName() {
        System.out.println("이름:" + name);
    }

    public static void printPopulation() {
        System.out.println("현재 인구 수: " + population);
    }
}
