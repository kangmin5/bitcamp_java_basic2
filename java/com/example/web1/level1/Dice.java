package com.example.web1.level1;

import java.util.Random;

/**
 * packageName: com.example.web1.level1
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-15
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-15   kangmin5    최초생성
 */
public class Dice {

    public static void main(String[] args) {
        //주사위 5번 굴려 나오는 값과 그 수들의 합
        dice5TimesSum();
        //홀수 나올때 까지 주사위 굴려 합하는 프로그래밍
        diceOddSum();
        //플레이어(Math랜덤값)와 컴퓨터(Random) 주사위 굴리기를 해서 이기면 "You win
        diceWin();

    }
    private static void diceWin(){

        int com = (int)(Math.random()*6)+1;
        System.out.println("컴퓨터 값:"+com);
        int player = (int)(Math.random()*6+1);
        System.out.println("플레이어 값:"+player);

        String text = "비겼다";
        if(com !=player)text =(player>com) ? "이겼다." :"졌다";
        System.out.println(text);
    }

    private static void diceOddSum(){
        String TITLE ="홀수나올때까지 숫자와 합계";
        int result = 0;
        System.out.println(TITLE);
        while (true){
            double d = Math.random();
            int temp = (int)(d*6)+1;
            if(temp % 2 ==1){
                break;
            } else {
                result +=temp;
            }
            System.out.println(" 값 :"+temp );;
            System.out.println("값의 합:"+result);
        }
    }

    private static void dice5TimesSum(){
        int result = 0;
        for (int i = 0; i <= 5; i++) {
            double d = Math.random();
            int temp = (int) (d * 6) + 1;  // 랜덤으로 1~6 정수값 다운캐스팅
            System.out.println(temp);
            result += temp;
        }
        System.out.println("5번 굴린 주사위 값의 합계" + result);
    }


}
