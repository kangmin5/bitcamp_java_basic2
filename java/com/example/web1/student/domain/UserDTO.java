package com.example.web1.student.domain;

/**
 * packageName: com.example.web1.calc
 * fileName   : login
 * author     : Kangmin5
 * date       : 2022-01-25
 * desc       : 아이디 암호 이름을 입력받고 출력하는 앱
 * ==================================
 * DATE     author       Note
 * ==================================
 * 2022-01-25   kangmin5    최초생성
 */
public class UserDTO {
    public static String TITLE = "=====LOGIN APP=====";

    private final static UserDTO userDTO = new UserDTO();
    private UserDTO() {}
    public static UserDTO getInstance() {return userDTO;}

    String id;
    String pw;
    String name;
    public static String PASSWORD = "abc";

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

}
