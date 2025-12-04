package chapter2.Two_8;

public class Child extends Parent{
    public String familyName = "자식의 이름";

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드된 메서드 호출입니다.");
    }
}
