package chap_09;

import java.util.ArrayList;

public class _09_Quiz {

    // 유재석 파이썬
    // 박명수 자바
    // 김종국 자바
    // 조세호 C
    // 서장훈 파이썬

    // 자바 자격증을 보유한 학생
    // 박명수
    // 김종국

    public static void main(String[] args) {

        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("유재석", "파이썬"));
        s.add(new Student("박명수", "자바"));
        s.add(new Student("김종국", "자바"));
        s.add(new Student("조세호", "C"));
        s.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("----------------------");
        for (Student student : s) {
            if(student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }

    }

}

class Student {
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}