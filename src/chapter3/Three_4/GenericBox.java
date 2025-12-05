package chapter3.Three_4;

public class GenericBox <T>{
    // 속성
    private T item;

    // 생성자
    public GenericBox(T item) {
        this.item = item;
    }

    // 기능
    public T getItem() {
        return this.item;
    }

    // ⚠️ 일반 메서드 T item 는 클래스의 <T> 를 따라갑니다.
    public void printItem(T item) {
        System.out.println(item);
    }

    // ✅ 제네릭 메서드 <S> 는 <T> 와 별개로 독립적이다.
    public <S> void printBoxItem(S item) {
        System.out.println(item);
    }
}
