package chapter2.Two_7;

public class Main {
    //TODO: 캡슐화(게터, 세터)
    public static void main(String[] args) {
        Person p1 = new Person();
        Robot robot = new Robot();

        //p1.secret; // ❌ 직접 접근 불가능
        String newSecret = p1.getSecret(); // ✅ 게터를 활용해 접근가능
        System.out.println("newSecret = " + newSecret);

        //p2.secret = "password"; // ❌ 직접접근, 변경 불가능
        p1.setSecret("newPassword"); // ✅ 세터를 활용해 접근, 변경가능

        //무분별한 게터세터는 캡슐화를 망각시키므로 필요한 부분만 받을 수 있게 조거을 달면 더 좋음
        p1.setStore("B1"); //B 입력시 오류

        //의미있는 세터
        robot.walk(true); ///모듈화의 개념

    }
}
