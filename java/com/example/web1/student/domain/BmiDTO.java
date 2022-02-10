package com.example.web1.student.domain;

/**
 * packageName: com.example.web1.bmi
 * fileName   : bmiApp
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : BMI지수를 표현하는 App
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-25   kangmin5    최초생성
 */
public class BmiDTO extends Object {
    public static String BMI_LOGO = "BMI 구하기";

    private final static BmiDTO bmiDTO = new BmiDTO();
    private BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}

    private String name;
    private double tall;
    private double weight;

    //get(),set() 인스턴스
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
