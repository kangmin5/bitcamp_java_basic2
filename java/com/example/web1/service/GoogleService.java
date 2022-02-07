package com.example.web1.service;

import com.example.web1.domain.GoogleDTO;

/**
 * packageName: com.example.web1.google
 * fileName   : google
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : google앱을 실행하는 controller
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-25   kangmin5    최초생성
 */
public class GoogleService {
    public String google(GoogleDTO google) {
        return String.format("검색할 단어는 : %s ", google.getText());

    }
}
