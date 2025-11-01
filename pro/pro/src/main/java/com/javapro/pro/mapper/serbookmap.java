package com.javapro.pro.mapper;

import com.javapro.pro.dto.Serbookdto;
import com.javapro.pro.entity.Serbook;

public class serbookmap {
    public static Serbookdto maptoSerbookdto (Serbook serbook){
        return new Serbookdto(
                serbook.getId(),
                serbook.getServiceid(),
                serbook.getPhone()

        );
    }
    public static Serbook maptoSerbook (Serbookdto serbookdto){
        return new Serbook(
                serbookdto.getId(),
                serbookdto.getPhone(),
                serbookdto.getServiceid()
        );
    }

}
