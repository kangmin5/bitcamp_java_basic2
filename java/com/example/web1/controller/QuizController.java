package com.example.web1.controller;

import com.example.web1.domain.GradeDTO;
import com.example.web1.service.QuizService;
import com.example.web1.service.QuizServiceImpl;

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
    public static void main(String[] args) {
        String[] arr = {"김아름", "장원종", "강민", "최건일", "유재혁",
                "Stack", "Blute Force", "그래프", "Binary Search", "Hash",
                "Heap", "DFS", "DP", "Greddy", "Sort",
                "Queue", "BFS",
        };
        QuizService service = new QuizServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("번호를 선택 : 0.종료 1. 2. 3. 4.강민(3개)");
        int num = scanner.nextInt();
        while (true){
            String res = "";
            switch (num) {
                case 0:
                continue;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    String s ="";
                    int count =0;
                    System.out.println("Q4. 팀원당 과목 수 예) 강민(2개),최건일(3개)");
                    int[] intArr = new int[5];
                    int[] resArr = new int[5];
                    for (int i = 5; i < arr.length; i++) {
                        int a = i % 5;
                        for(int j=0 ; j<5 ;j++){
                            count = intArr[j]++;
                        }
                        s += arr[a]+"("+count +")개,";
                    }
                    System.out.println(s);
                    break;
                default:
                    break;
            }
        }


    }
}
