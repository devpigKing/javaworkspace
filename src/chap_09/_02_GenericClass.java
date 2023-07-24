package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("뽀송이 오빠");
        c2.ready();

        System.out.println("----------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("호롤로로");
        c4.ready();

        System.out.println("----------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name );

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String) c3.name;

        System.out.println("----------------------");

        Coffee<Integer> c5 = new Coffee<>(43);
        c5.ready();
        int c5Name = c5.name;
        System.out.println(c5Name);

        Coffee<String> c6 = new Coffee<>("도라이");
        c6.ready();
        String c6Name = c6.name;
        System.out.println(c6Name);

        System.out.println("----------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("김깨비"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("윤뽀송"));
        c8.ready();

        System.out.println("----------------------");
        orderCoffee("도토리");
        orderCoffee(24);

        orderCoffee("도토리", "더블 에스프레소 프라푸치노");
        orderCoffee(55, "라떼");

    }


    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 커피 준비 완료 : " + name);
    }
}
