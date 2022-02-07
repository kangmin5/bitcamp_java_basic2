package com.example.web1.service;

import java.util.Scanner;

/**
 * packageName: com.example.web1.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-07
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-07   kangmin5    최초생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    @Override
    public void DICE(Scanner scanner) {
        String res = " ";
        int start = 0;
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        System.out.println("숫자 0을 입력하면 게임이 시작합니다.");
        if(start == scanner.nextInt()) {
            System.out.println("사용자가 주사위를 던집니다.");
            System.out.println(dice1);
            System.out.println("컴퓨터가 주사위를 던집니다.");
            System.out.println(dice2);}

        if(dice1>dice2) {
            res = "사용자가 이겼습니다.";
        }else if(dice1 == dice2){
            res = "비겼습니다.";
        } else res = "컴퓨터가 이겼습니다.";
        System.out.println(res);
    }

    @Override
    public void rps(Scanner scanner) {

    }

    @Override
    public void getPrime(Scanner scanner) {
        int count=0;
        System.out.println("100이하의 숫자를 입력(소수 구하기 : ");
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {
            for(int j=2; j<=i;j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+"\t");
            }
            count =0;
        }
    }

    @Override
    public void leapYear(Scanner scanner) {
        System.out.println("자바로 입력받은 연도가 윤년인지 평년인지 판단하기");
        System.out.println("연도를 입력하시오");
        int a = scanner.nextInt();
        /*if(a%4==0){
            System.out.println(a+"년은 윤년입니다");
        }else if(a%400==0){
            System.out.println(a+"년은 윤년입니다");
        }else if(a%100!=0){
            System.out.println(a+"년은 평년입니다");
        }*/
        /*int input = 0;
        int a = 0;
        switch (input){
            case a%4==0 :
                System.out.println("윤년");
                break;
            case a%100!=0 :
                System.out.println("평년");
                break;
            case a%400==0 :
                System.out.println("윤년");
                break;
        }*/
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(a +"는 윤년입니다");
        }else{
            System.out.println(a +"는 평년입니다");
        }
    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("5. 임의로 입력받은 숫자 맞추기\n"+"1~100 숫자 입력");
        int count = 0;
        int num = (int)(Math.random() * 100)+1;
        int num_enter = 0;
        Scanner cho = new Scanner(System.in);

        while (num != num_enter){
            num_enter = cho.nextInt();
            if(num_enter >= 101){
                System.out.println("숫자를 1부터 100까지 입력해주세요.");}
            else if(num > num_enter){
                System.out.println("UP");
                count++;
            }else if(num < num_enter){
                System.out.println("DOWN");
                count++;
            }
        }
        System.out.println("정답입니다\t" + count +"회 만에 맞췄어요.");
//        cho.close();
        return;
    }
}
