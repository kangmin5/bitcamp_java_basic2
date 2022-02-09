package com.example.web1.oop.domain;

/**
 * packageName: com.example.web1.quiz.domain
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-09
 * desc       :
 * 삼성은 신형폰은 절대 아이폰이 아니라고 했다.
 * 갤럭시라고하고, 신형폰은 페이 기능을 지원한다고 했다.
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-09   kangmin5    최초생성
 */
public class GalPhone extends IPhone{
    public final static String KIND = "갤럭시";
    private String pay;

    public GalPhone(String company,String kind,String move){
        super(company,kind,move);
    }


    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s 에서 만든 %s 제품을 사용해서 %s 로 결제한다.",super.getCompany(),super.getKind(),pay);
    }
}
