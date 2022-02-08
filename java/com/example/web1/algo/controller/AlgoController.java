package com.example.web1.algo.controller;

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
    public  void execute(Scanner scanner){

        while (true){
            System.out.println("======[SUB MENU][알고리즘]======");
            System.out.println("[담당] 0.종료 1.강민");
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("0.EXIT");
                    return;
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Wrong Number");
                    break;

            }
        }
    }
}
