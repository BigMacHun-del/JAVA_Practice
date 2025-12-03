package chapter1;
import java.util.Scanner;

public class One_6 {
    public static void main(String[] args) {
        //TODO: 연산자 정리
        //전위 후위
        num_ca(1);

        //연산자 우선 순위
        System.out.println(10 / 2 + 3 * 2 > 10 || false);
        /* 실행 순서: ((10 / 2) + (3 * 2)) > 10 || false
           → (5 + 6) > 10 || false
           → 11 > 10 || false
           → true || false
           → true */
        System.out.println(5 + 3 > 2 * 4 && 10 % 3 == 1);
        /* 실행 순서: (5 + 3) > (2 * 4) && (10 % 3) == 1
           → 8 > 8 && 1 == 1
           → false && true
           → false */

        //문자열 비교
        string_test();

    }

    //전위 후위 연산자
    public static int num_ca(int num) {
        num++;
        num++;  //num = 3
        num--;
        System.out.println(num--);   //num 2출력 이후 num - 1
        System.out.println(++num);   //num 2출력 이후 num + 1

        return num;
    }

    //문자열 비교 함수
    public static void string_test() {
        //문자열 비교
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 문자를 입력하세요 : ");
        String text1 = sc.nextLine();
        System.out.print("두 번째 문자를 입력하세요 : ");
        String text2 = sc.nextLine();
        boolean isEqual = text1.equals(text2);
        if (isEqual) {
            System.out.println("text1와 text2는 같습니다");
        }
        else {
            System.out.println("text1와 text2는 다릅니다");
        }
    }

}
