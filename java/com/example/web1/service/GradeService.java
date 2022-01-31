package com.example.web1.service;

import com.example.web1.domain.GradeDTO;
import org.jetbrains.annotations.NotNull;

/**
 * packageName: com.example.web1.grade
 * fileName   : GradeDemo
 * author     : kangmin5
 * date       : 2022-01-26
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-01-26   kangmin5    최초생성
 */
public class GradeService {
    public String execute(@NotNull GradeDTO grade) {
        System.out.println(" GradeService에 들어옴");
        System.out.println(grade.toString());
        int total = grade.getKor()+ grade.getEng()+ grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" :"불합격";
        return String.format("%s 학생의 국어: %d 영어:%d 수학:%d 이고 합계는 %d, 평균은 %d\n %s",
                grade.getName(),grade.getKor(),grade.getEng(),grade.getMath(),total,avg,pass);
    }

}
