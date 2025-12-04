package chapter2.Two_8;

abstract class Animal {
    public String name;
    public void sleep(){
        System.out.println("name = " + name);
    }

    abstract void eat();  //구현부가 없으므로 자식이 무조건 구현해야 함(추상화)
}

