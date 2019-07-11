package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        // String 방식
        String str = "디미고";
        str += "2학년";
        str += "5반";
        str += "류성민";

        // StringBuilder 방식
        StringBuilder sb = new StringBuilder("디미고");
        sb.append("2학년");
        sb.append("5반");
        sb.append("류성민");

        System.out.println(sb.toString());
        System.out.println(sb);     // toString을 구현해둠

        compareSpeed();
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        for(int i = 0; i<100000000; i++){
            //str = str + "def";
            sb2.append("def");
        }


        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
