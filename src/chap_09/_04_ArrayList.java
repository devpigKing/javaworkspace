package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 => 많은 데이터를 효과적으로 관리하기 위해 자바에서 지원해주는 프레임워크
        // List, Set, Map
        // List(ArrayList, LinkedList)

        ArrayList<String> list = new ArrayList<>();


        // 데이터 추가
        list.add("도톨씨");
        list.add("바보");
        list.add("외국인");
        list.add("호롤로");
        list.add("정처기");

        // 데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-----------------");

        // 삭제 (호롤로씨가 이사)
        System.out.println("신청 학생 수 (이사 전) : " + list.size());

        list.remove("호롤로");

        System.out.println("신청 학생 수 (이사 후) : " + list.size());
        System.out.println(list.get(3));

        System.out.println("-----------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size());

        list.remove(list.size() - 1);

        System.out.println("남은 학생 수 (제외 후) : " + list.size());


        System.out.println("-----------------");

        // 순회 (foreach문)
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(1));
        list.set(1, "천재");
        System.out.println("수강권 양도 후 : " + list.get(1));

        System.out.println("-----------------");

        // 확인
        System.out.println(list.indexOf("외국인"));

        // 선착순 5명 내에 포함되었는가?

        if (list.contains("외국인")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-----------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-----------------");

        // 다음 학기에 새로 공부 시작
        list.add("도톨씨");
        list.add("바보");
        list.add("외국인");
        list.add("호롤로");
        list.add("정처기");

        // 정렬
        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }
    }
}
