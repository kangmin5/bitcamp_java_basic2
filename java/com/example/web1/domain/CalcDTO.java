package com.example.web1.domain;
/**
 * packageName: com.example.web1.calc
 * fileName   : calcApp
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : 숫자 두개를 입력하고 연산자를 넣어 합을 출력하는 앱
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-25   kangmin5    최초생성
 */

public class CalcDTO {
    public static String CALC_TITLE ="======계산기======";
    private int num1;
    private String opcode;
    private int num2;

    public int getNum1() {
        return num1;
    }
    public String getOpcode() {
        return opcode;
    }
    public  int getNum2(){
        return num2;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

//    public String getCalc(int num1, String opcode, int num2) {
//        this.num1 =num1;
//        this.opcode = opcode;
//        this.num2 = num2;
//        int res =0;
//
//        //switch Statements
//        switch (opcode){
//            case "+": res = this.num1+this.num2;break;
//            case "-": res = this.num1-this.num2;break;
//            case "*": res = this.num1*this.num2;break;
//            case "/": res = this.num1/this.num2;break;
//        }
//
//        String result =String.format("%d %s %d = %d", num1, opcode, num2, res);
//        return  result;
//    }

}
