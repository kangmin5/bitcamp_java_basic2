package com.example.web1.domain;

/**
 * packageName: com.example.web1.domain
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-03
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-03   kangmin5    최초생성
 */
public class ReportDTO {
    public static String TITLE = "=====5조 자료구조=====";
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
