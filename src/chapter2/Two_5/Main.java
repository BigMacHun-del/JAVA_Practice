package chapter2.Two_5;

public class Main {
    public static void main(String[] args) {
        //TODO: final
        final double a = 36;
        // a = 2;   final 때문에 변수의 값 변경이 제한된다.
        System.out.println(a);

        //상수 활용
        System.out.println(Circle.PI);  //static 상수 가져오기

        //불변 객체 활용
        final Circle circle = new Circle(2);  ///참조 변경을 final이 막아주지만 내부 변수선언이 final이 아니라면 값을 바꿀 수 있다.
        System.out.println("불변객체: " + circle.radius);
        // circle.radius = 1; 불변객체를 수정 시 오류 발생
        
        //불변 객체의 내부상태가 변경이 필요한 경우(사실 안바뀌고 새로운 객체임)
        Circle circle2 = new Circle(3);
        System.out.println("circle2.radius = " + circle2.radius);

        Circle circle3 = circle2.changeRadius(4);
        System.out.println("circle3.radius = " + circle3.radius);
    }
}
