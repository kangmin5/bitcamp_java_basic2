package com.example.web1.oop.domain;

/**
 * packageName: com.example.web1.quiz.domain
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-09
 * desc       :
 * 아이폰은 CelPhone에서 검색(search)속성이 추가된다.
 * 잡스는 아이폰을 휴대폰으로 불리는 것을 거부했다. 그래서 KIND는 아이폰이다.
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-09   kangmin5    최초생성
 */
public class IPhone extends CelPhone{
    public final static String KIND = "아이폰";
    protected String search;

    public IPhone(String kind, String company, String move) {
        super(kind, company, move);
    }



    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;

    }
    @Override
    public String toString() {
        return String.format("%s에서 만든 %s를 사용해서 %s중에 %s 를 검색한다.",super.getCompany(),KIND,super.getMove(),search);
    }
}
