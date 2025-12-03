package chapter1;
import java.util.Scanner;

public class One_7 {
    public static void main(String[] args) {
        //TODO: 조건문
        if_sample();
        switch_sample();
    }

    public static void if_sample(){
        Scanner sc = new Scanner(System.in);
        System.out.print("빨강, 노랑, 초록 중 하나를 입력하세요: ");
        String light = sc.nextLine();


        if (light.equals("초록")) {
            System.out.println("건너세요!");
        } else if (light.equals("빨강")) {
            System.out.println("멈추세요!");
        } else if (light.equals("노랑")){
            System.out.println("주의하세요!");
        } else{
            System.out.println("그런 색은 없습니다.");
        }
    }

    public static void switch_sample(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1, 2, 3 중의 하나를 입력하시오.");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("1 이다!");
                break;
            case 2:
                System.out.println("2 다!");
                break;
            case 3:
                System.out.println("3 이다!");
                break;
            default:
                System.out.print("입력 오류");
        }
    }
}
