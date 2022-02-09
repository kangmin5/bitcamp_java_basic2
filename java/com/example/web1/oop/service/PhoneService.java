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
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
