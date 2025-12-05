package chapter3.Three_1;

public class Main {
    //TODO: 예외 처리
    public static void main(String[] args) {
        //1. 의도하지 않은 예외
//        int zero = 10 / 0;
//        System.out.println("zero = " + zero);
//        System.out.println("프로그램 종료");

        //2. 의도적인 예외 - throw
//        int age = 10;
//        if (age < 18) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
//        }
//
//        System.out.println("프로그램 종료"); //예외 발생 후 처리가 따로 없으므로 실행 안됨

        //3. 언체크 예외 호출
        ExceptionPractice exceptionPractice = new ExceptionPractice();
        exceptionPractice.callUncheckedException();

        //4. 체크 예외 호출
        try{
            exceptionPractice.callCheckedException();
        } catch (Exception e){
            System.out.println("체크 예외 처리");
        }


        System.out.println("프로그램 종료");

    }
}
