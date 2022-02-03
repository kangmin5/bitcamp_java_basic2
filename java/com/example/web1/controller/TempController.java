package com.example.web1.controller;

import com.example.web1.domain.GradeDTO;
import com.example.web1.service.GradeService;

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
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수를 입력하시오 : ");
        int count = scanner.nextInt();
        GradeDTO[] grades = new GradeDTO[count];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("수학점수 입력 : ");
            grades[i] = new GradeDTO();
            grades[i].setMath(scanner.nextInt());
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println("수학점수 :"+ grades[i].getMath());
        }

    }
}
