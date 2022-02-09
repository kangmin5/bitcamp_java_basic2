package com.example.web1.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.web1.quiz.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-08
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-08   kangmin5    최초생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    /**
     * 은행 입출금
     *
     * */
    public void bank(Scanner scanner) {
        int jango = 0;
        int money =0;

        while (true){
            System.out.printf("은행 잔고는 : %d 원 입니다.",jango);
            System.out.print("선택 (0.종료 1. 입금  2.출금) : ");
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("===소메뉴 종료===");
                    return;
                case 1:
                    System.out.println("입금액을 입력하세요 : ");
                    money = scanner.nextInt();
                    jango +=money;
                    System.out.printf("%d 원을 입금하였습니다. 잔고는 %d 원 입니다.",money,jango);
                    break;
                case 2:
                     money = scanner.nextInt();
                    jango -=money;
                    System.out.printf("%d 원을 출금하였습니다. 잔고는 %d 원 입니다.",money,jango);
                    break;
                default:
                    break;
            }
            System.out.println();
        }

    }

    @Override
    public void gugudan(Scanner scanner) {
        System.out.println("5. 구구단");
        for (int i = 1; i < 10; i++) {
            System.out.println(" ### " + i + "단 ###");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
