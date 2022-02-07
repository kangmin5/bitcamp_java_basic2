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
public class StudentServiceImpl implements StudentService {
    /**
     * BMI = w / t * t
     * <p>
     * 대한비만학회는 이보다 더 엄격하다.
     * <p>
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * 이다.
     */
    @Override
    public String getBmi(BmiDTO param) {
        double bmi = param.getWeight() / (param.getTall() * param.getTall()) * 10000;
        String resResult;

        if (bmi >= 35)
            resResult = "고도비만";
        else if (bmi > 35 && bmi >= 30)
            resResult = "중도비만(2단계 비만)";
        else if (bmi < 30 && bmi >= 25)
            resResult = "경도비만(1단계 비만)";
        else if (bmi < 25 && bmi >= 23)
            resResult = "과체중";
        else if (bmi < 23 && bmi >= 18.5)
            resResult = "정상";
        else if (bmi < 18.5)
            resResult = "저체중";
        else
            resResult = "다시 확인 바랍니다.";
        return String.format("%s 님의 키는 %.2f 몸무게는 %.2f 이고 BMI지수는 %.2f 건강상태는 %s ", param.getName(),param.getTall(), param.getWeight(), bmi, resResult);
    }

    @Override
    public String calc(CalcDTO calc) {
        int sum = 0;
        switch (calc.getOpcode()) {
            case "+":
                sum = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                sum = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                sum = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                sum = calc.getNum1() / calc.getNum2();
                break;
        }

        return String.format("%d + %s + %d = %d 입니다.",
                calc.getNum1(), calc.getOpcode(), calc.getNum2(), sum);
    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("검색할 단어는 : %s ", google.getText());
    }

    @Override
    public String getGrade(@NotNull GradeDTO grade) {
        System.out.println(" GradeService에 들어옴");
        System.out.println(grade.toString());
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";
        return String.format("%s 학생의 국어: %d 영어:%d 수학:%d 이고 합계는 %d, 평균은 %d\n %s",
                grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);
    }

    @Override
    public String login(LoginDTO login) {
        return (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format(" %s님의 비번 %s 가 맞습니다. 로그인성공 ", login.getName(), login.getPw())
                : String.format(" %s님의 ID는 맞고 ,비번 %s 가 틀립니다. 로그인실패 ", login.getId(), login.getPw());
    }
}
