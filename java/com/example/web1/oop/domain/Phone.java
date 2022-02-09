package com.example.web1.oop.domain;

/**
 * packageName: com.example.web1.quiz.domain
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-09
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-09   kangmin5    최초생성
 */
public class Phone {
    protected String kind;
    protected String company;
    protected String call;
    private String message;

    public Phone(String kind,String company){
        this.kind = kind;
        this.company = company;
    }

    public String getKind() {
        return kind;
    }



    public String getCompany() {
        return company;
    }



    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "kind='" + kind + '\'' +
                ", company='" + company + '\'' +
                ", call='" + call + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
