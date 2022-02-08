package com.example.web1.aaa.controller;

/**
 * packageName: com.example.web1.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-04
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-04   kangmin5    최초생성
 */

public class ArrayExam {
    public static void main(String[] args) {

        String[] arr = {"김아름", "장원종", "강민", "최건일", "유재혁",
                "Stack", "Blute Force", "그래프", "Binary Search", "Hash",
                "Heap", "DFS", "DP", "Greddy", "Sort",
                "Queue", "BFS",
        };
//-----------------------------------------------------------
        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        String item;
        String manager = "";

        for (int i = 0; i < arr.length; i++) {
            while (i < 5) {
                if (arr[i % 5] == arr[i])
                    s += arr[i] + "\t";

            }
            System.out.println(s);
//------------------------------------------------------------------
            System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
            s = "";
            s = arr[2] + ", " + arr[7] + ", " + arr[13];
            System.out.println(s);

//-------------------------------------------------------------------------
            System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
            s = "";
            s = arr[15] + "를 담당한 사람:  " + arr[0];
            System.out.println(s);


        }
    }
}