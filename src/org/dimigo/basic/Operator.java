package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int money = 1700000;
        int pnum = 3;
        int mnum = 1500;

        System.out.println("<<디미벅스 연간 인건비>>");
        System.out.println("월 평균 급여 : "+String.format("%,d", money) + "원");
        System.out.println("점포 내 직원 수 : "+pnum + "명");
        System.out.println("점포 수 : "+String.format("%,d", mnum) + "개\n");
        System.out.printf("연간 인건비 : "+String.format("%,d", (long)money*pnum*mnum*12) + "원");
    }
}
