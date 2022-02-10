package com.example.web1.student.service;

import com.example.web1.student.domain.UserDTO;

/**
 * packageName: com.example.web1.calc
 * fileName   : login
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : 아이디 암호 이름을 입력받고 출력하는 실행 앱
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-25   kangmin5    최초생성
 */
public class LoginService {
    public  String login(UserDTO login) {

//        return String.format("아이디는 %s  암호는 %s 이름은 %s",login.get,login.pw,login.name);
        return (login.getPw().equals(UserDTO.PASSWORD)) ? String.format(" %s님의 비번 %s 가 맞습니다. 로그인성공 ",login.getName(),login.getPw())
                : String.format(" %s님의 ID는 맞고 ,비번 %s 가 틀립니다. 로그인실패 ",login.getId(),login.getPw());
    }
}
