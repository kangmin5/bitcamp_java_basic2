package com.example.web1.aaa.controller;


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
public class Feb06Controller {
    public static void main(String[] args) {
        String[] arr = {"김아름", "장원종", "강민", "최건일", "유재혁",
                "Stack", "Blute Force", "그래프", "Binary Search", "Hash",
                "Heap", "DFS", "DP", "Greddy", "Sort",
                "Queue", "BFS",
        };
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("0.종료  1.quiz1  2.quiz2  3.quiz3  3-2.quiz32  4.quiz4 ");
            String select = scanner.next();
            switch (select) {
                case "0":
                    System.out.println("0.종료");
                    return;
                case "1":
                    quiz1(arr);
                    break;
                case "2":
                    quiz2(arr);
                    break;
                case "3":
                    quiz3(arr);
                    break;
                case "32":
                    quiz32(arr);
                    break;
                case "4":
                    quiz4(arr);
                    break;
                default:
                    break;
            }
        }

    }

    private static void quiz1(String[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + "." + arr[i] + " :\t";
        }
        System.out.println(s);
    }

    private static void quiz2(String[] arr) {
        String s;
        s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요 예) 감잔영: 힙, 그래프");
        String zzang = "";
        String manager = "강민";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(manager)) {
                for (int j = i; j < arr.length; j = j + 5) {
                    zzang += arr[j] + ", ";
                }
            }
//            if(i %5 ==2){
//                zzang += arr[i]+",";
//                if(i >12){break;}
//            }
        }
        System.out.println(zzang);
    }

    private static void quiz3(String[] arr) {
        int x;
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예)큐를 담당한 사람: 권혜민 ");
        String qManager = "";
        String itemName = "Queue";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == itemName) {
                x = arr[i].length() % 5;
                qManager = arr[x];
            }
        }
        System.out.println(qManager);
    }

    private static void quiz32(String[] arr) {
        System.out.println("Q3-1 입력한 과목의 인덱스를 추출하세요.");

        String itemName1 = "DP";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(itemName1)) {
                System.out.println(arr[i] + "인덱스 값은" + i);
            }
        }
    }

    private static void quiz4(String[] arr) {
        System.out.println("Q4. 팀원당 과목 수 예) 강민(2개),최건일(3개)");
        String s ="";
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int a = i % 5;
            if(a ==0){
                count++;
            }
            if(a ==1){

            }
        }


    }

}