package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 리스트는 중복 데이터를 허용한다.

        LinkedList<String> list = new LinkedList<>();
        list.add("도토리");
        list.add("빡빡이");
        list.add("비타민");
        list.add("오메가3");
        list.add("홍삼");


        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("----------------------");

        // 추가
        list.addFirst("다람쥐");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");


        list.addLast("백준");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");


        System.out.println("학생 추가 전 (index 1) : " + list.get(1));
        list.add(1, "개발자");
        System.out.println("학생 추가 후 (index 1) : " + list.get(1));
        System.out.println("학생 추가 후 (index 2) : " + list.get(2));

        System.out.println("----------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1 );
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("----------------------");


        // 처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        for(String s : list) {
            System.out.println(s);
        }

        list.removeFirst(); // 처음 데이터
        list.removeLast(); // 마지막 데이터

        System.out.println("남은 학생 수 (전학 후) : " + list.size());

        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        // 변경 (수강권 양도)
        list.set(0, "카카오");
        System.out.println(list.get(0));

        System.out.println("----------------------");


        // 확인
        System.out.println(list.indexOf("비타민"));
        if (list.contains("비타민")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("----------------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("----------------------");

        list.add("도토리");
        list.add("빡빡이");
        list.add("비타민");
        list.add("오메가3");
        list.add("홍삼");

        // 정렬
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
