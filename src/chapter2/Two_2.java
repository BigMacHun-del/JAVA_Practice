package chapter2;

public class Two_2 {
    static class Person {
        //TODO 메서드, 힙, 스택(프로그램 흐름)
        /// 코드를 넣으면 한눈에 프로그램 흐름을 보여주는 사이트 : https://cscircles.cemc.uwaterloo.ca/java_visualize/#mode=display
        // 1. 속성
        String name;
        int age;
        String address;

        // 2. 생성자
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 3-1. 소개 기능(이름 나이 출력 기능)
        void introduce() {
            System.out.println("나의 이름은");
            System.out.println(this.name + "입니다.");
            System.out.println("나의 나이는");
            System.out.println(this.age + "입니다.");
        }

        // 3-2. 더하기 기능(소개를 하고 더하기 연산 수행)
        int sum(int value1, int value2) {
            introduce();
            int result = value1 + value2;
            return result;
        }
    }

    public static void main(String[] args) {
        String name = "Steve";
        int age = 20;
        Person personA = new Person(name, age);
        personA.introduce();

        int value1 = 1;
        int value2 = 2;

        int ret = personA.sum(value1, value2);
        System.out.println(ret);
    }
}
