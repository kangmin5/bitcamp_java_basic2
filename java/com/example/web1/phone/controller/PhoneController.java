package com.example.web1.phone.controller;

import com.example.web1.phone.service.PhoneService;
import com.example.web1.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.web1.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-08
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-08   kangmin5    최초생성
 */
public class PhoneController {
    public  void execute(Scanner scanner) {

        PhoneService service = new PhoneServiceImpl();
        while (true){
            String menu = "\n0.EXIT \n1.집전화 \n2.휴대폰 \n3.아이폰 \n4.갤럭시노트  \n";
            System.out.println("[SUB MENU]"+menu);
            System.out.println("번호를 선택 : ");
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("0.EXIT");
                    return;
                case 1:
                    System.out.println("1. 집전화");
                    service.usePhone(scanner);
                    break;
                case 2:
                    System.out.println("2. 휴대폰");
                    service.useCelPhone(scanner);
                    break;
                case 3:
                    System.out.println("3. 아이폰");
                    service.useIPhone(scanner);
                    break;
                case 4:
                    System.out.println("4. 갤럭시노트");
                    service.useGalPhone(scanner);
                    break;
                default:
                    System.out.println("Wrong Number");
                    break;
            }
        }
    }
}
