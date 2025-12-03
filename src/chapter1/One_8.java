package chapter1;

public class One_8 {
    public static void main(String[] args) {
        //TODO: 반복문
        for_sample();
        while_sample();
        dowhile_sample();
    }

    public static void for_sample(){
        for(int i = 0; i <= 9; i++){
            if(i % 2 == 0){
                System.out.println("2의 배수 : " + i);
            } else if(i % 3 == 0){
                System.out.println("3의 배수 : " + i + " ");
            } else if(i == 7){
                System.out.println("여기까지");
                break;
            }
        }
    }

    public static void while_sample(){
        int j = 0;
        while(j <= 10){
            System.out.print(j);
            j++;
        }
    }

    public static void dowhile_sample(){
        int i = 1;
        System.out.println();
        do {        //종결 조건이 밖에 있어 어떠한 경우에도 1번은 실행 됨
            System.out.print(i);
            i++;
        } while (i <= 10);
    }
}
