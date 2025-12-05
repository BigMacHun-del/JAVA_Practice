package chapter3.Three_3;

import java.util.*;

public class Main {
    //TODO: 컬렉션
    public static void main(String[] args) {
        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<>(); //배열과는 달리 크기가 정해저 있지 않기 때문에 유연하다
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        /// ArrayList 활용
        System.out.println("List 인터페이스를 구현한 ArrayList -------------------------------------------------------------------------" );
        ArrayList<String> names = new ArrayList<>();

        //데이터 추가
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("1");
        names.add("2");

        //순서 보장
        System.out.println(names);

        //중복 데이터 허용
        names.add("1");
        System.out.println(names);

        //데이터 단건 조회
        String name1 = names.get(0); //get으로 인덱스 접근
        System.out.println(name1);

        //데이터 삭제
        names.remove(0);
        System.out.println(names);

        //배열의 크기 출력과 동일
        System.out.println(names.size());


        /// Set 을 구현한 HashSet -------------------------------------------------------------------------
        System.out.println("Set 인터페이스를 구현한 HashSet -------------------------------------------------------------------------" );
        HashSet<String> uniqueNames = new HashSet<>();

        // ✅ 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");

        // ⚠️ 순서를 보장 안함
        System.out.println("uniqueNames = " + uniqueNames);
        // uniqueNames.get(0); // ❌ get 사용 불가

        // ⚠️ 중복 불가
        uniqueNames.add("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // ✅ 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        /// Map 을 구현한 HashMap -------------------------------------------------------------------------
        System.out.println("Map 인터페이스를 구현한 HashMap -------------------------------------------------------------------------" );
        HashMap<String, Integer> memberMap = new HashMap<>();  //  HashMap<키, 값>

        // ✅ 추가
        memberMap.put("Spartan", 15);
        memberMap.put("Steve", 15); // ✅ 값은 중복 가능
        memberMap.put("Isac", 1);
        memberMap.put("John", 2);
        memberMap.put("Alice", 3);

        // ⚠️ 순서 보장 안함
        System.out.println("순서 보장 안함 = " + memberMap);

        // ⚠️ 키 중복 불가: 값 덮어쓰기 발생
        memberMap.put("Alice", 5);
        System.out.println("키 중복 불가 = " + memberMap);  //기존에 있는 키의 값에 덮어씀 3 -> 5

        // ✅ 조회: 15
        Integer value = memberMap.get("Isac");
        System.out.println("키를 통해 추출한 값 = " + value);
        System.out.println(memberMap.get("Steve"));

        // ✅ 삭제 가능
        memberMap.remove("Spartan");
        System.out.println("삭제 가능 = " + memberMap);

        // ✅ 키 확인
        Set<String> keys = memberMap.keySet();  //Set은 자동완성으로 배열형식
        System.out.println("키 확인 = " + keys);

        // ✅ 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("값 확인 = " + values);
    }
}
