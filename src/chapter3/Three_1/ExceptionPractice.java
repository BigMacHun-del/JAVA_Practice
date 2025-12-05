package chapter3.Three_1;

public class ExceptionPractice {
    // 언체크 예외 호출
    public void callUncheckedException(){
        try{
            if(true){
                System.out.println("언체크 예외 발생");
                throw new RuntimeException();   //catch문 없어도 컴파일러가 안 잡기 때문에 오류발생하지 않음
            }
        } catch(RuntimeException e){
            System.out.println("언체크 예외 처리");
        }
    }

    // 체크 예외 호출
    public void callCheckedException() throws Exception{ //throws 해당 예외 처리를 상위 메서드에서 진행한다는 의미.
        if(true){
            System.out.println("체크 예외 발생");
            throw new Exception();      //catch문 같은 예외 처리 구문이 없으면 컴파일러가 오류 발생시킴
        }
//        try{
//            if(true){
//                System.out.println("체크 예외 발생");
//                throw new Exception();      //catch문 같은 예외 처리 구문이 없으면 컴파일러가 오류 발생시킴
//            }
//        }  catch(Exception e){
//            System.out.println("체크 예외 처리");
//        }
    }
}
