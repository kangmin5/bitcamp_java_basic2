package com.example.web1.oop.controller;

import com.example.web1.oop.domain.CelPhone;
import com.example.web1.oop.domain.GalPhone;
import com.example.web1.oop.domain.IPhone;
import com.example.web1.oop.domain.Phone;
import com.example.web1.oop.service.PhoneService;
import com.example.web1.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.web1.oop.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-09
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-09   kangmin5    최초생성
 */
public class OopController {
    public void execute(Scanner scanner) {

        while (true){
            System.out.println("[메뉴] 0.exit  \n"+
                    "1.은닉화 \n"+
                    "2.상속 \n"+
                    "3.추상화 \n"+
                    "4.다형성 "
                    );
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("===종료===");
                    return;
                case 1:
                    System.out.println("은닉화");
                    break;
                case 2:
                    System.out.println("POJO가 은닉화다");
                    break;
                case 3:
                    System.out.println("extends가 상속이다.");
                    PhoneService service = new PhoneServiceImpl();


                    Phone phone = new Phone("금성전화기","금성전자");
                    CelPhone celPhone = new CelPhone("핸드폰","블랙베리","이동중에");

                    IPhone iPhone = new IPhone("아이폰","애플","이동");

                    GalPhone galPhone = new GalPhone("삼성","삼성","이동삼성에");
                    System.out.println("[소메뉴 0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시폰]");
                    switch (scanner.nextInt()){
                        case 0:
                            System.out.println("===종료===");
                            return;
                        case 1:
                            System.out.println("===집 전화===");
                            phone.setCall("여보세요 xxx입니다." );
                            phone.setMessage(" 메시지입니다.");
                            service.usePhone( phone);
                            break;
                        case 2:
                            System.out.println("===휴대폰입니다.===");
                            celPhone.setCall("안녕하세요.");
                            service.useCelPhone(celPhone);
                            break;
                        case 3:
                            System.out.println("===아이폰입니다..===");
                            iPhone.setSearch("뉴스");
                            service.useIPhone(iPhone);
                            break;
                        case 4:
                            System.out.println("===갤럭시폰입니다..===");
                            galPhone.setPay("롯데pay");
                            service.useGalPhone(galPhone);
                            break;

                        default:
                            break;
                    }
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }
}
