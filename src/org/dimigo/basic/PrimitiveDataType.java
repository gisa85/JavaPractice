package org.dimigo.basic;

public class PrimitiveDataType {
    public static void main(String[] args) {
        String name = "아이유";
        boolean isMale = false;
        int age = 25;
        double height = 161.8;
        float weight = 44.3F;
        char bloodType = 'A';
        String titleSong = "삐삐";

        System.out.println("<< 아이유 프로필 >>");
        System.out.println("이름 : " + name);
        System.out.println("성별 : " + (isMale?"남자":"여자"));
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + bloodType);
        System.out.println("대표곡 : " + titleSong);
    }
}
