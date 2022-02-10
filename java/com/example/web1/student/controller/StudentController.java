package com.example.web1.student.controller;

import com.example.web1.student.domain.BmiDTO;
import com.example.web1.student.domain.CalcDTO;
import com.example.web1.student.domain.GoogleDTO;
import com.example.web1.student.domain.GradeDTO;
import com.example.web1.student.domain.UserDTO;
import com.example.web1.student.service.*;

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
public class StudentController {
    public  void execute(Scanner scanner) {
        StudentService service = new StudentServiceImpl();
//        BmiDTO bmi = new BmiDTO();
//        CalcDTO calc = new CalcDTO();
//        GoogleDTO google = new GoogleDTO();
//        GradeDTO grades = new GradeDTO();
//        UserDTO login = new UserDTO();
        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GoogleService googleService = new GoogleService();
        GradeService gradeService = new GradeService();
        LoginService loginService = new LoginService();
        //두번쨰 스레드 반복하기 위한 포인트 찾기
        while(true){
            System.out.println("SUB MENU");
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
                    BmiDTO b =BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setTall(scanner.nextInt());
                    b.setWeight(scanner.nextInt());
                    res = service.getBmi(b);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_TITLE+"\n숫자1,연산자,숫자2 입력 : ");
                    CalcDTO c = CalcDTO.getInstance();
                    c.setNum1(scanner.nextInt());
                    c.setOpcode(scanner.next());
                    c.setNum2(scanner.nextInt());
                    res = service.calc(c);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE + "\n검색할 단어 입력 : ");
                    GoogleDTO g = GoogleDTO.getInstance();
                    g.setText(scanner.next());
                    res = service.search(g);
                    break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE+ "\n 학생 수를 입력하고,이름,국어,영어,수학 입력 : ");
                    GradeDTO grades = GradeDTO.getInstance();
                    System.out.println("학생수를 입력하세요");
//                    int count = scanner.nextInt();
                    res = service.getGrade(grades);
                    System.out.println("이름,국어,영어,수학 입력 : ");
//                    for(int i =0;i <count ;i++) {
                        System.out.println("다음 입력 : ");
                        grades.setName(scanner.next());
                        grades.setKor(scanner.nextInt());
                        grades.setEng(scanner.nextInt());
                        grades.setMath(scanner.nextInt());
                        System.out.println();
                        System.out.println("이름은 " +grades.getName()+"국어점수 : " +grades.getKor()+ "수학점수 :"+ grades.getMath()+"영어점수 : "+
                                grades.getEng());

                    break;
                case "5":
                    System.out.println(UserDTO.TITLE+"\n아이디,패스워드,이름 입력 : ");
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    res = service.login(u);
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
