package chapter2.Two_8;

public class Main {
    //TODO: 상속, 추상화
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.familyName);
        System.out.println(child.honor);
        child.introduceFamily();  //오버라이드 하여 부모의 메소드 변경

        //추상화
        //Animal animal = new Animal(); //추상 클래스는 객체를 생성할 수 없다.

        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        cat.eat();
    }
}
