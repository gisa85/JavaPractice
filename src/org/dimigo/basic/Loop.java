package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        byte choose;
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        String mycharacter="";

        do{
            int my = 0;
            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");
            choose = scan.nextByte();

            switch (choose){
                case 1:
                    my = random.nextInt(4);
                    mycharacter = character[my];
                    System.out.println(mycharacter+"(으)로 설정되었습니다.");
                    break;
                case 2:
                    if(mycharacter == ""){
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                    attackPoint[my] += 10;
                    System.out.println(mycharacter+" 공격력이 증가되었습니다. 현재 공격력 : "+attackPoint[my]);
                    break;
                case 3:
                    if(mycharacter == ""){
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                    else if(attackPoint[my]<=0){
                        System.out.println("공격력을 감소시킬 수 없습니다.");
                        break;
                    }
                    attackPoint[my] -= 10;
                    System.out.println(mycharacter+" 공격력이 감소되었습니다. 현재 공격력 : "+attackPoint[my]);
                    break;
                case 9:
                    System.out.println("이제 공부 하세요!");
                    scan.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다!!");
                    break;
            }
        } while(choose!=9);
    }
}
