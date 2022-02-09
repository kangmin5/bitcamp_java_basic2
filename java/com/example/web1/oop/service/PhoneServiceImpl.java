package com.example.web1.oop.service;

import com.example.web1.oop.domain.CelPhone;
import com.example.web1.oop.domain.GalPhone;
import com.example.web1.oop.domain.IPhone;
import com.example.web1.oop.domain.Phone;

/**
 * packageName: com.example.web1.oop.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-09
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-09   kangmin5    최초생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());
    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());
    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());
    }
}
