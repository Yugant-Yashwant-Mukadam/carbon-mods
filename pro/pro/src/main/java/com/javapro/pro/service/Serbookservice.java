package com.javapro.pro.service;

import com.javapro.pro.dto.Serbookdto;

import java.util.List;

public interface Serbookservice {

    Serbookdto createSerbook(Serbookdto serbookdto);

    List<Serbookdto> getAllSerbook();
}
