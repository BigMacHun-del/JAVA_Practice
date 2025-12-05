package chapter3.Three_4;

public class Main {
    //TODO: 제네릭
    public static void main(String[] args) {
        GenericBox<String> strGBox = new GenericBox<>("ABC");

        // ⚠️ 일반메서드: 클래스 타입 매개변수를 따라갑니다.
        // String 데이터 타입 기반으로 타입소거가 발생.
        // String 타입의 다운캐스팅 코드 삽입!
        strGBox.printItem("ABC"); // ✅ String 만 사용가능
        //strGBox.printItem(100);   // ❌ 에러 발생

        // ✅ 제네릭 메서드: 독립적인 타입 매개변수를 가집니다.
        // String 타입 정보가 제네릭 메서드에 아무런 영향을 주지 못함.
        // 다운캐스팅 코드 삽입되지 않음.
        strGBox.printBoxItem("ABC"); //✅ 모든 데이터 타입 활용 가능
        strGBox.printBoxItem(100);   //✅ 모든 데이터 타입 활용 가능
        strGBox.printBoxItem(0.1);   //✅ 모든 데이터 타입 활용 가능
    }
}
