package chapter3.Three_2;

import java.util.Optional;

public class Main {
    //TODO: Optional
    public static void main(String[] args) {
        Camp camp = new Camp();
        Student student = new Student("Steve");
        camp.setStudent(student);

        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent();    //isPresent 값이 널이면 false 널이 아니면 true

        if(flag){
            Student student1 = studentOptional.get();  //데이터 가져오기
            String studentName =  student1.getName();
            System.out.println(studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

        // 1. student NULL
//      Student student = camp.getStudent();
//        System.out.println(student);

//        //직접적인 null 처리 방법
//        String studentName;
//        if (student != null) { // ⚠️ 가능은하지만 현실적으로 어려움
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아닙니다";
//        }
//        System.out.println("studentName = " + studentName);

        // 2. NULLPonteException  --> 언체크 예외
//        String studentName = student.getName();
//        System.out.println("학생 이름 : " + studentName);


    }
}
