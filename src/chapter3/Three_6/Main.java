package chapter3.Three_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    //TODO: 스트림(stream,map,fliter)
    public static void main(String[] args) {
        // ArrayList 선언
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // ✅ for 명령형 스타일: 각 요소 * 10 처리
        List<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            int multipliedNum = num * 10; // 각 요소 * 10
            ret1.add(multipliedNum);
        }
        System.out.println("ret1 = " + ret1);

        // ✅ 스트림 선언적 스타일: 각 요소 * 10 처리
        List<Integer> ret2 = arrayList.stream()  //1. 데이터 흐름 준비 : 스트림 생성
                .map(num -> num * 10)     //2. 중간 연산 등록 단계 : 10배 로직 등록
                .collect(Collectors.toList());   //3. 최종 연산 단계 : 리스트로 결과 반환
        System.out.println("ret2 = " + ret2);

        /* List로 받는 이유
           다형성을 활용해 List 인터페이스로 ArrayList 구현체를 받으면 나중에 다른 구현체(LinkedList , Vector) 로 변경할 때
           코드 수정을 최소화할 수 있기 때문입니다.
           실무에서 리스트를 선언할 때 대부분 아래와 같이 List 타입으로 받는 것을 권장합니다.
        */

        // 1. 익명클래스를 직접 만들어서 매개변수로 전달
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };
        List<Integer> ret3 = arrayList.stream().map(function).collect(Collectors.toList());
        System.out.println("ret3 = " + ret3);

        // 2. 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> function1 = (num -> num * 10);
        List<Integer> ret4 = arrayList.stream().map(function1).collect(Collectors.toList());
        System.out.println("ret4 = " + ret4);

        // 3. 람다식을 직접 매개변수로 전달
        List<Integer> ret5 = arrayList.stream().map(num -> num * 10).collect(Collectors.toList());
        System.out.println("ret5 = " + ret5);

        // 중간 연산을 함께 사용한느 방법(filter() + map())
        // 리스트에서 짝수만 * 10
        List<Integer> ret6 = arrayList.stream()
                .filter(num -> num % 2 == 0)  // 중간 연산 등록(짝수 찾기)
                .map(num -> num * 10)         // 중간 연산 등록(곱하기 10)
                .collect(Collectors.toList());
        System.out.println("ret6 = " + ret6);


    }
}
