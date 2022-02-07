package com.example.web1.service;

import com.example.web1.domain.*;
import org.jetbrains.annotations.NotNull;

/**
 * packageName: com.example.web1.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-07
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-07   kangmin5    최초생성
 */
public interface StudentService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String getGrade(@NotNull GradeDTO grades);
    String login(LoginDTO login);

}
