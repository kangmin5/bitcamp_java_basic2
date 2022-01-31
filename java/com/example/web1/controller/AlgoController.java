package com.example.web1.controller;

import java.util.Scanner;

/**
 * packageName: com.example.web1.algorithm
 * fileName   :
 * author     : kangmin5
 * date       : 2022-01-27
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-01-27   kangmin5    최초생성
 */
public class AlgoController {
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
                    "7. dfs \t" +
                    "8. bfs \n" +
                    "[강민] 9. dp \t" +
                    "10. graph \n" +
                    "[최건일] 11. bin search\t" +
                    "12. Greedy \n"
            );
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    System.out.println("");
                    break;
                default:
                    System.out.println("WRONG Number");
                    break;
            }
        }
    }
}
