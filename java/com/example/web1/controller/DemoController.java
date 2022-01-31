package com.example.web1.controller;

import com.example.web1.domain.BmiDTO;
import com.example.web1.service.BmiService;
import com.example.web1.domain.CalcDTO;
import com.example.web1.service.CalcService;
import com.example.web1.domain.GoogleDTO;
import com.example.web1.service.GoogleService;
import com.example.web1.domain.GradeDTO;
import com.example.web1.service.GradeService;
import com.example.web1.domain.LoginDTO;
import com.example.web1.service.LoginService;

import java.util.Scanner;

/**
 * packageName: com.example.web1.controller
 * fileName   : DemoController
 * author     : kangmin5
 * date       : 2022-01-27
 * desc       : 만들었던 여러 class들을 취합하여 main을 통합한 Controller App
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-01-31   kangmin5   BMI영역 double형으로 모두 수정하여 결과 값 정확히 도출
 * 2022-01-27   kangmin5    최초생성
 */
public class DemoController {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //두번쨰 스레드 반복하기 위한 포인트 찾기
        while(true){
            System.out.println("메뉴 선택");
            BmiDTO bmi = new BmiDTO();
            CalcDTO calc = new CalcDTO();
            GoogleDTO google = new GoogleDTO();
            GradeDTO grade = new GradeDTO();
            LoginDTO login = new LoginDTO();
            BmiService bmiService = new BmiService();
            CalcService calcService = new CalcService();
            GoogleService googleService = new GoogleService();
            GradeService gradeService = new GradeService();
            LoginService loginService = new LoginService();
            String menu = "0.EXIT 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println(menu);
            System.out.println("번호를 선택 : ");
            String select = scanner.next();
            String res = "";
            switch (select) {
                case "0":
                    System.out.println("EXIT");
                    return;
                case "1":
                    System.out.println(BmiDTO.BMI_LOGO+"\n이름,키,몸무게 입력 :");
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = bmiService.getBmi(bmi);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_TITLE+"\n숫자1,연산자,숫자2 입력 : ");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE + "\n검색할 단어 입력 : ");
                    google.setText(scanner.next());
                    res = googleService.getGoogle(google);
                    break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE+ "\n이름,국어,영어,수학 입력 : ");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.execute(grade);
                    break;
                case "5":
                    System.out.println(LoginDTO.TITLE+"\n아이디,패스워드,이름 입력 : ");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.execute(login);
                    break;
                default:
                    res = "1~5 사이의 숫자를 입력하세요.";
                    break;
            }
            System.out.println(res);
            System.out.println();
        }
    }
}
