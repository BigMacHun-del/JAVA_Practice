package chapter2.Two_1;

public class Person {
     //TODO: 객체와 클래스
        // 1. 속성
        String name;
        int age;
        String address;

        // 2. 생성자
        /*Person(){}  기본 생성자*/
        Person(String name, int age) {
            this.name = name;
            this.age = age;
            /// 생성자 특징: 클래스와 이름이 같다. 반환타입이 존재하지 않는다. 여러개가 존재할 수 있다.
        }

        // 3. 기능(메서드)
        int sum(int value1, int value2){
            return value1+value2;
        }

        ///getter : 속성을 가져오는 기능
        String getName() {
            return this.name;
        }

        ///setter : 속성을 설정하는 기능
        void setAddress(String address) {
            this.address = address;
        }
}
