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
        while (true){
            System.out.println("###가위바위보 게임###\n" +
                    "0.종료 1.가위 2.바위 3.보");
            int user = scanner.nextInt();
            int com = (int)(Math.random() * 3);
            String[] arr = {"가위", "바위", "보"};
            String s = "결과: ";
            while (user<0){
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");
                user = scanner.nextInt();
            }
            while (user>3){
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");
                user = scanner.nextInt();
            }
            if (user == 0){break;}
            System.out.println("사용자: "+ arr[user-1]+"\t컴퓨터: "+arr[com]);
            if (user-1 == com){
                s += "무승부";
            } else if (com == (user-1)%3+1){
                s += "컴퓨터 승리";
            } else {
                s += "유저 승리";
            }
            System.out.println(s);
        }
    }

    @Override
    /**
     * 소수를 구하기
     * 소수는 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수이다.
     * 설명) 자연수를 기준으로  기초값 1은 생략하고 범위를 주면 값을 구하는 공식
     *      숫자를 입력하면 1~숫자 까지의 소수들 print
     * */
    public void getPrime(Scanner scanner) {
        int count=0;
        System.out.println("숫자를 입력(소수 구하기) : ");
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
    /**윤년은 4년마다 돌아오는데 100년으로 나누어 떨어지면 평년
     * but 400년으로 나누어 떨어지면 윤년
     * ex) 2020, 2024, 2028 => 윤년
     *     2100, 2200, 2300 => 평년
     *     2000, 2400, 2800 => 윤년
     *     조건이 참일 경우 윤년 아닐경우 평년
     *
     */
    public void leapYear(Scanner scanner) {
        System.out.println("자바로 입력받은 연도가 윤년인지 평년인지 판단하기\n"+"연도를 입력하시오");
        int a = scanner.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(a +"년은 윤년입니다");
        }else{
            System.out.println(a +"년은 평년입니다");
        }
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
                break;}*/
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
        System.out.println("정답입니다 " + count +"회 만에 맞췄어요.");
    }
}
