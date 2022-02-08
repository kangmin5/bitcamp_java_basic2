package com.example.web1.student.domain;

/**
 * packageName: com.example.web1.google
 * fileName   : google
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       :
 * 인스턴스변수/ text
 * 클래스변수/ GOOGLE
 * 로컬변수/ result
 * 파라미터/ text
 *              를 이해하기 위해 google초기 검색창을 만든 앱
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-25   kangmin5    최초생성
 */
public class GoogleDTO {
    public static String GOOGLE = "======Google======";
    private String text;

    public String getText(){
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

//
//    public String getGoogle(String text) {
//        this.text =text;
//        String result = String.format("검색 결과는 : %s ",this.text);
//        return result;
//    }

}
