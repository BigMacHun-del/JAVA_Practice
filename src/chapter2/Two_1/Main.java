package chapter2.Two_1;

public class Main {
    public static void main(String[] args) {
        //객체 생성
        Person personA = new Person("훈대김", 23);
        Person personB = new Person("대훈김", 29);

        //속성에 접근
        System.out.println("설정 전 이름 : "+ personA.name + personB.name);
        personA.name = "김대훈";
        personB.name = "김훈대";
        System.out.println("설정 후 이름 : "+ personA.name + personB.name);


        personA.age = 26;
        personB.age = 30;

        personA.address = "서울 특별시";
        personB.address = "부산 광역시";

        System.out.println("촤종 A : "+ personA.name + personA.age + personA.address);
        System.out.println("최종 B : "+ personB.name + personB.age + personB.address);


        //기능 활용
        ///객체의 메서드 사용
        int result = personA.sum(1, 2);
        System.out.println(result);



        /// getter
        String name = personA.getName();
        System.out.println("name : " + name);

        /// setter
        personA.setAddress("서울");
        System.out.println("personA의 주소 :" + personA.address);
    }
}
