package chapter2.Two_5;

public class Circle {
    // 속성
    final  static  double PI=3.141592;

    final double radius; //final이 없으면 불변객체가 아니고, 값이 바뀐다.
    //생성자
    Circle(double radius){
        this.radius=radius;
    }

    //기능
    Circle changeRadius(double newRadius){
        return new Circle(newRadius);
    }  ///생성자를 내부에서 호출하여 불변객체의 값이 바뀌는 것처럼 할 수 있다.
}
