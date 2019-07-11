package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        // 1. 문자열 리터럴 방식
        String dog1 = "댕댕이";
        String dog2 = "댕댕이";

        System.out.println(dog1 == dog2 ? "재사용합니다." : "재사용 안합니다.");

        // 2. new 객체 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");

        System.out.println(cat1 == cat2 ? "재사용합니다." : "재사용 안합니다.");

        // 문제
        System.out.println(dog1 == "댕댕이" ? "같음" : "다름");
        System.out.println(cat1 == "야옹이" ? "같음" : "다름");

        System.out.println(dog1.equals(dog2) ? "같음" : "다름");
        System.out.println(cat1.equals(cat2) ? "같음" : "다름");

        String id = "adMin";

        // id가 'admin'이면 "관리자입니다" 출력
        // "admin"이 아니면 "관리자 아님" 출력

        System.out.println("admin".equalsIgnoreCase(id) ? "관리자임" : "관리자 아님");
        
        testString();
    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length()); //!
        System.out.println(s.substring(3,6));   //!
        System.out.println(s.indexOf('C'));
        System.out.println(s.charAt(9));
        System.out.println(s.concat("HIJKLMNOP"));
        System.out.println("           ABC           ".trim()); //!
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a', 'A'));
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("FG"));
    }
}
