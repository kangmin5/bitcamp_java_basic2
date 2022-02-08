package com.example.web1.quiz.controller;

import com.example.web1.quiz.service.Feb06Service;
import com.example.web1.quiz.service.Feb06ServiceImpl;

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
    public  void execute(Scanner scanner) {
        String[] arr = {"김아름", "장원종", "강민", "최건일", "유재혁",
                "Stack", "Blute Force", "그래프", "Binary Search", "Hash",
                "Heap", "DFS", "DP", "Greddy", "Sort",
                "Queue", "BFS",
        };
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Controller feb07Controller = new Feb07Controller();

        System.out.println("번호를 선택 : 0.종료 1.Feb06 2.Feb07 3.Feb08 4.Feb09 ");
        int num = scanner.nextInt();
        while (true){

            switch (num) {
                case 0:
                    System.out.println("0.EXIT");
                    return;
                case 1:
                    break;
                case 2:
                    feb07Controller.execute(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }


    }
}
