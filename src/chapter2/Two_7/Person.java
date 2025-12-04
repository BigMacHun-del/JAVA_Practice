package chapter2.Two_7;

public class Person {
    private String secret = "oldPassword";
    private String store;

    //게터 활용
    public String getSecret() {
        System.out.println("Private 속성 추출.");
        return this.secret; // ✅ 객체의 secret 속성 반환
    }

    //세터 활용
    public void setSecret(String secret) {
        System.out.println("입력 완료: " + secret);
        this.secret = secret; // ✅ secret 속성 설정 및 변경
    }

    //무분별한 게터세터는 캡슐화를 망각시키므로 필요한 부분만 받을 수 있게 조거을 달면 더 좋음
    public void setStore(String data) {
        if ("B".equals(data)) {
            System.out.println("❌ 'B'는 입력할 수 없습니다!");
        } else {
            this.store = data;
        }
    }
}
