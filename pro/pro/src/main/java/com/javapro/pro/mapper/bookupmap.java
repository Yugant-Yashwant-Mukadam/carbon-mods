package com.javapro.pro.mapper;

import com.javapro.pro.dto.Bookupdto;
import com.javapro.pro.entity.Bookup;


public class bookupmap {
    public static Bookupdto maptobookupdto (Bookup bookup){
        return new Bookupdto(
                bookup.getPhone(),
                bookup.getBooking(),
                bookup.getPickup(),
                bookup.getServicedone()

        );
    }
    public static Bookup maptobookup (Bookupdto bookupdto){
        return new Bookup(
                bookupdto.getPhone(),
                bookupdto.getBooking(),
                bookupdto.getPickup(),
                bookupdto.getServicedone()
        );
    }
}
