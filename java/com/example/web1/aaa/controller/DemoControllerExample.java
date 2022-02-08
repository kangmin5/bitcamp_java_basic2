package com.example.web1.aaa.controller;

import java.util.Scanner;

/**
 * packageName: com.example.web1.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-01-27
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-01-27   kangmin5    최초생성
 */
/*
public class DemoController2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("[MENU] 0.exit ");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    break;
                default:
                    System.out.println("WRONG MENU");
                    break;
            }
        }
    }
}
*/
/*
public class DemoController2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("[MENU] 0.Exit ");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");
                    return;
                case "1":
                    break;
                default:
                    System.out.println("WRONG Number");
                    break;
            }
        }
    }
}
 */

public class DemoControllerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[MENU] 0.Exit \n" +
                    "[김아름] 1. stack \t"+
                    "2. queue \t" +
                    "3. heap \n" +
                    "[유재혁] 4. hash \t" +
                    "5. sort \n" +
                    "[장원종] 6. brute force \t" +
                    "7. dfs \n" +
                    "8. bfs \n" +
                    "[강민] 9. dp \t" +
                    "10. graph \n" +
                    "11.[최건일] bin search\t" +
                    "12. Greedy \n"
                    );
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    break;
                default:
                    System.out.println("WRONG Number");
                    break;
            }
        }
    }
}