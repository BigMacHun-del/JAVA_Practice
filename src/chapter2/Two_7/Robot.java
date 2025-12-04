package chapter2.Two_7;

public class Robot {
    private boolean leftLeg; // 세터필요
    private boolean rightLeg;// 세터필요
    private boolean leftArm; // 세터필요
    private boolean rightArm;// 세터필요

    public void walk(boolean power) {
        System.out.println("🚶 오른쪽 다리 앞으로!");
        this.rightLeg = power;
        System.out.println("🚶 왼쪽 다리 앞으로!");
        this.leftLeg = power;
        System.out.println("🚶 오른쪽 팔 앞으로!");
        this.rightArm = power;
        System.out.println("🚶 왼쪽 팔 앞으로!");
        this.leftArm = power;
    }
}
