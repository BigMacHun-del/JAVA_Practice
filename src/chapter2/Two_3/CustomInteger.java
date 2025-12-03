package chapter2.Two_3;

public class CustomInteger {
    //1. 속성
    int value;

    //2. 생성자
    CustomInteger() {
        value = 0;
    }
    CustomInteger(int value) {
        this.value = value;
    }

    //3. 기능 -> 문자열로 자동 변환
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
