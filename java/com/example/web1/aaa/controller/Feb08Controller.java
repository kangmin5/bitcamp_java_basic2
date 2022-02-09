package com.example.web1.aaa.controller;

import com.example.web1.quiz.service.Feb07Service;
import com.example.web1.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.web1.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-08
 * desc       : 5조 Feb08 취합본
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-08   kangmin5    최초생성
 */
public class Feb08Controller {
    public  void execute(Scanner scanner) {
        Feb07Service service = new Feb07ServiceImpl();
        System.out.println("[5조 Feb08 ] ");
        System.out.println(" 작성자 : 1.유재혁 2.최건일 3.강민 4.장원종 5.김아름");
        String menu = "0.EXIT 1.주사위 2.가위바위보 3.소수 구하기 4.입력받은년도가(윤년/평년) 5.임의의숫자맞추기";
        System.out.println(menu);
        System.out.print("번호 입력: ");
        while(true){
            String res="";
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("EXIT");
                    return;
                case 1:
                    service.DICE(scanner);
                    break;
                case 2:
                    service.rps(scanner);
                    break;
                case 3:
                        service.getPrime(scanner);
                    break;
                case 4:
                    service.leapYear(scanner);
                    break;
                case 5:
                    service.numberGolf(scanner);
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("[5조 Report ] ");
            System.out.println(" 작성자 : 1.유재혁 2.최건일 3.강민 4.장원종 5.김아름");
            System.out.println(menu);
        }
    }
}
