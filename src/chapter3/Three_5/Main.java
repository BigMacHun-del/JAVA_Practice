package chapter3.Three_5;

public class Main {
    //TODO: 람다

    public static int calculate(int a, int b, Calculator calculator) {
        return calculator.sum(a, b);
    }

    public static void main(String[] args) {
        // ✅ 람다식 활용
        Calculator calculator = (a, b) -> a + b; //매개 변수로 추론해서 동작함
        int ret = calculator.sum(3, 3);
        System.out.println("ret = " + ret);

        //람다식을 매개변수로 전달하는 방법
        // 1. 익명클래스를 변수에 담아 매개변수로 전달
        Calculator cal1 = new Calculator(){
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // 2. 람다식을 변수에 담아 매개변수로 전달
        Calculator cal2 = (a, b) -> a + b;
        int ret1 = calculate(5, 3, cal2);
        System.out.println("re1 = " + ret1);

        // 3. 람다식을 직접 매개변수로 전달
        int ret2 = calculate(5, 5, (a, b) -> a + b );
        System.out.println("re2 = " + ret2);
    }

}
