package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] questions = {
                "가장 좋아하는 가수는? ",
                "가장 좋아하는 배우는? ",
                "가장 좋아하는 과목은? "
        };
        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };
        int input = 0;
        int index = 0;
        String answer = new String();

        do {
            index = random.nextInt(3);
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.print("메뉴 선택 => ");
            input = scanner.nextInt();

            switch (input){
                case 1:
                    System.out.print(questions[index]);
                    answer = scanner.next();
                    if(answers[index].equals(answer)){
                        System.out.println("정답입니다!");
                        break;
                    }
                    else{
                        System.out.println("틀렸습니다!");
                        break;
                    }
                case 2:
                    System.out.println("<< 정답 출력 >>");
                    for (int i = 0; i<3; i++){
                        StringBuilder printAnswer = new StringBuilder(questions[i]);
                        printAnswer.append(answers[i]);
                        printAnswer.append("입니다.");
                        System.out.println(printAnswer);
                    }
                    break;
                case 9:
                    System.out.println("bye~");
                    break;
                default :
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        }while(input != 9);
    }
}
