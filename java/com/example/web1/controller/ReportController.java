package com.example.web1.controller;

import com.example.web1.domain.ReportDTO;

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
public class ReportController {
    public static void main(String[] args) {
        String[] fiveNames =    {"강민",     "최건일",     "유재혁",     "김아름",    "장원종"};
        String[] fiveSubjects = {"그래프",    "Bin",       "Hash",      "Stack", "Blute Force",
                                 "DP",       "Greddy",    "Sort",      "Heap",  "DFS",
                                "BFS",       "",          "",          "",      ""};
        for(int i =0 ; i <fiveNames.length;i++){
            System.out.println(fiveNames[i] + ":"+ fiveSubjects[i]+","+fiveSubjects[i+5]+","+fiveSubjects[i+10]);

        }
    }
}