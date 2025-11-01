package com.javapro.pro.service.impl;


import com.javapro.pro.dto.Serbookdto;

import com.javapro.pro.entity.Serbook;
import com.javapro.pro.mapper.serbookmap;
import com.javapro.pro.mapper.serbookmap;
import com.javapro.pro.repository.serbookrepo;
import com.javapro.pro.repository.serbookrepo;
import com.javapro.pro.service.Serbookservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Serbookimpl implements Serbookservice {

    private serbookrepo serbookrepository;

    @Override
    public Serbookdto createSerbook(Serbookdto Serbookdto) {
        Serbook serbook = serbookmap.maptoSerbook(Serbookdto);
        Serbook savedserbook =serbookrepository.save(serbook);

        return serbookmap.maptoSerbookdto(savedserbook);
    }

    @Override
    public List<Serbookdto> getAllSerbook() {
        List<Serbook> serbooks= serbookrepository.findAll();
        return serbooks.stream().map((serbook)-> serbookmap.maptoSerbookdto(serbook))
                .collect(Collectors.toUnmodifiableList());
    }
}
