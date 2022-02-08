package com.example.web1.student.service;

import com.example.web1.student.domain.CalcDTO;

/**
 * packageName: com.example.web1.calc
 * fileName   : calcDemo
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : calcApp계산기 실행하는 Controller
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-31               수정
 * 2022-01-25   kangmin5    최초생성
 */


public class CalcService {
    public String calc(CalcDTO calc) {
        int sum = 0;
        switch (calc.getOpcode()){
            case "+" : sum = calc.getNum1()+calc.getNum2();break;
            case "-" : sum = calc.getNum1()-calc.getNum2();break;
            case "*" : sum = calc.getNum1()*calc.getNum2();break;
            case "/" : sum = calc.getNum1()/calc.getNum2();break;
        }

        return String.format("%d + %s + %d = %d 입니다.",
                calc.getNum1(),calc.getOpcode(),calc.getNum2(),sum);

    }
}
