package com.example.web1.domain;

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
public class BmiDTO {
    public static String BMI_LOGO = "======BMI계산하기=======";
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

    //get(),set() 인스턴스 END

//    public String getBmi(String name, int tall, int weight) {
//        this.name = name;
//        this.tall = tall;
//        this.weight = weight;
//        int bmiResult = this.weight / (this.tall * this.tall) * 10000;
//
//        String res = String.format("성명 : %s 님의 BMI지수는 : %.2f 입니다.", name, bmiResult);
//        if (bmiResult > 30)
//            System.out.println("과체중");
//        else if (bmiResult > 25)
//            System.out.println("뚱보");
//        else
//            System.out.println("보통");
//        return res;
//    }


}
