package com.example.web1.service;

import com.example.web1.domain.BmiDTO;

/**
 * packageName: com.example.web1.bmi
 * fileName   : bmiDemo
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : bmiApp을 실행하는 Controller
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-31   kangmin5   BMI영역 double형으로 모두 수정하여 결과 값 정확히 도출
 * 2022-01-25   kangmin5    최초생성
 */

//public class BmiService {
//    public String excute(String name,double tall,double weight) {
//        BmiDTO bmiApp = new BmiDTO();
//        return bmiApp.getBmi(name,tall,weight);
//    }
//}

public class BmiService {
    public String getBmi(BmiDTO bmi) {
        double res =0;
        res = (bmi.getWeight() / (bmi.getTall() * bmi.getTall())) * 10000;
        String resResult;
        if(res>=30)
            resResult="고도비만";
        else if(res<30 && res>=25)
            resResult="비만";
        else if(res<25 && res>=23)
            resResult="과체중";
        else if(res<23 && res>=18.5)
            resResult="정상";
        else if(res<18.5)
            resResult = "저체중";
        else
            resResult = "다시 확인 바랍니다.";
        return String.format("%s 님의 키는 %.2f 몸무게는 %.2f 이고 BMI지수는 %.2f 건강상태는 %s ", bmi.getName(),bmi.getTall(),bmi.getWeight(),res,resResult);
    }
}
