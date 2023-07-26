package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        // 중복 허용 x
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("삼겹살");
        set.add("상추");
        set.add("치즈볼");

        System.out.println("총 구매 상품 수 : " + set.size());


        // 순회
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        // 확인
        if (set.contains("치즈볼")) {
            System.out.println("치즈볼 사러 출발");
        }

        System.out.println("-----------------------");

        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size());
        set.remove("치즈볼");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size());

        System.out.println("-----------------------");


        // 전체 삭제
        set.clear();
        if ( set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }

        System.out.println("-----------------------");


        // 세트 : 중복 허용 X, 순서 보장 X
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(23);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }

    }
}
