package com.example.web1.quiz.controller;

import com.example.web1.quiz.service.*;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

/**
 * packageName: com.example.web1.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-03
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-03   kangmin5    최초생성
 */

public class QuizController {
    public void execute(Scanner scanner){

        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true){
            System.out.println("[서브메뉴]\n 0)Exit 1)2월6일 2)2월7일 3)2월8일 4)2월10일");
            switch (scanner.next()){
                case "0":
                    System.out.println("### 서브메뉴 종료 ###");
                    return;
                case "1":
                    String[] arr = {"김아름", "장원종", "강민", "최건일", "유재혁",
                            "Stack", "Blute Force", "그래프", "Binary Search", "Hash",
                            "Heap", "DFS", "DP", "Greddy", "Sort",
                            "Queue", "BFS",
                    };
                    System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 소메뉴 종료 ###");
                            return;
                        case "1":
                            System.out.println("### 1.팀별 과제 ###");
                            feb06Service.quiz1(arr);
                            break;
                        case "2":
                            break;
                        default:
                            break;
                    }
                break;

                case "2":
                    System.out.println("[소메뉴]\n0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기 \n4.윤년/평년 \n5.임의숫자 맞추기");
                    System.out.println(" 작성자 : 1.유재혁 2.최건일 3.강민 4.장원종 5.김아름");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 소메뉴 종료 ###");
                            return;
                        case "1":
                            System.out.println("### 1.주사위 ###");
                            feb07Service.DICE(scanner);
                            break;
                        case "2":
                            System.out.println("### 2.가위바위보 ###");
                            feb07Service.rps(scanner);
                            break;
                        case "3":
                            System.out.println("### 3.소수 구하기 ###");
                            feb07Service.getPrime(scanner);
                            break;
                        case "4":
                            System.out.println("### 4.윤년/평년 ###");
                            feb07Service.leapYear(scanner);
                            break;
                        case "5":
                            System.out.println("### 5.임의의 수 맞추기 ###");
                            feb07Service.numberGolf(scanner);
                            break;
                        default:
                            break;
                    }
                break;

                case "3":
                    System.out.println("[소메뉴]\n0.Exit \n1.로또 \n2.야구 \n3.좌석예약 \n4.은행입출금 \n5.구구단");
                    System.out.println("작성자 : 1.최건일 2.장원종 3.김아름 4.강민 5.유재혁");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 소메뉴 종료 ###");
                            return;
                        case "1":
                            System.out.println("### 1.로또 ###");
                            feb08Service.lotto(scanner);
                            break;
                        case "2":
                            System.out.println("### 2.야구 ###");
                            feb08Service.baseball(scanner);
                            break;
                        case "3":
                            System.out.println("### 3. 좌석예약 ###");
                            feb08Service.booking(scanner);
                            break;
                        case "4":
                            System.out.println("### 4. 은행입출금 ###");
                            feb08Service.bank(scanner);
                            break;
                        case "5":
                            System.out.println("### 5. 구구단 ###");
                            feb08Service.gugudan(scanner);
                            break;
                        default:
                            System.out.println("Wrong Number !!!");
                            break;
                    }
                    break;
                case "4":
                    System.out.println("작성자 : 1.김아름 2.강민 3.유재혁 4.최건일 5.장원종");
                    System.out.println("[소메뉴]\n0.Exit \n1.bubbleSort, insertionSort, selectionSort \n2.quickSort, mergeSort" +
                            " \n3.magicSquare \n4.zigzag \n5.rectangleStarPrint, triangleStarPrint");

                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 소메뉴 종료 ###");
                            return;
                        case "1":
                            System.out.println("### 1.bubbleSort, insertionSort, selectionSort ###");
                            feb10Service.bubbleSort();
                            break;
                        case "2":
                            System.out.println("### 2.quickSort, mergeSort ###");
                            feb10Service.quickSortRun();
                            feb10Service.mergeSort();
                            break;
                        case "3":
                            System.out.println("### 3. magicSquare ###");
                            break;
                        case "4":
                            System.out.println("### 4. zigzag ###");
                            feb10Service.zigzag();
                            break;
                        case "5":
                            System.out.println("### 5. rectangleStarPrint, triangleStarPrint ###");
                            break;
                        default:
                            System.out.println("Wrong Number !!!");
                            break;                    }
                    break;
                default:
                    System.out.println("Wrong Number!!!");
                    break;

            }
        }
    }

}