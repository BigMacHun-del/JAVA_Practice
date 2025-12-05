package chapter3.Three_2;

import java.util.Optional;

public class Camp {
    //속성
     private Student student;

    //생성자
    public Camp() {
        this.student = student;

    }


    //기능
    public Optional<Student> getStudent() {   //NULL을 리턴할 가능성이 있으므로 Optional 사용
        return Optional.ofNullable(student);
        //return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
}
