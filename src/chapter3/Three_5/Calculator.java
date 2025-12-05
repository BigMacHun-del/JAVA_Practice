package chapter3.Three_5;

@FunctionalInterface // ✅ 함수형 인터페이스 선언 - 한 개의 추상 메서드만 선언하겠다는 뜻
public interface Calculator {
    int sum(int a, int b); // ✅ 오직 하나의 추상 메서드만 선언해야합니다.
}
