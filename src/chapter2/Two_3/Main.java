package chapter2.Two_3;


import java.awt.*;
import java.util.Arrays;

public class Main {
    //TODO: 래퍼 클래스, 참조형
    public static void main(String[] args) {
        //기본형 변수
        int a = 1;
        System.out.println(a);

        //참조형 변수(객체, 배열)
        Person personA = new Person("무명", 2);
        System.out.println("personA : " + personA); /// 속성을 지정 안했으니 객체의 주소값 반환
        int[] arr = {1,2,3,4,5};
        System.out.println(arr);  ///배열의 주소값 반환

        //래퍼 클래스(객체) -> 참조형 변수이지만 내부적으로 로직이 있어 일반 값이 출력된다.
        Integer num = 100;
        System.out.println("객체로 선언한 숫자 :" + num);

        String numStr = num.toString(); /// 래퍼클래스는 toString과 같이 변수를 객체처럼 다루기 위해서 사용한다.
        System.out.println("숫자를 문자열로 : " + numStr);


        //래퍼 클래스 직접 만들기
        CustomInteger myInteger = new CustomInteger(231425); //CustomInteger 클래스에서 만듦
        String myStrInger = myInteger.toString();
        System.out.println(myStrInger);

        //오토 박싱 (기본형 -> 래퍼)
        Integer num3 = 10; /// = Interger num3 = Integer.valueOf(10) 내부적 코드

        //오토 언박싱(래퍼 -> 기본형)
        int num4 = num3;  ///참조형인 래퍼 클래스를 사용했는데도 int 값에 대입 됨
        System.out.println("참조형인데도 오류안나네? " + num4);
    }
}
