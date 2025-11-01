package com.javapro.pro.service.impl;


import com.javapro.pro.dto.Bookupdto;
import com.javapro.pro.entity.Bookup;
import com.javapro.pro.execption.Bookupnotfound;
import com.javapro.pro.execption.Customernotfound;
import com.javapro.pro.mapper.bookupmap;
import com.javapro.pro.repository.bookuprepo;
import com.javapro.pro.service.Bookupservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Bookupimpl implements Bookupservice {

    private bookuprepo bookuprepository;

    @Override
    public Bookupdto createBookup(Bookupdto bookupPhone) {
        Bookup bookup = bookupmap.maptobookup(bookupPhone);
        Bookup savedbookup = bookuprepository.save(bookup);

        return bookupmap.maptobookupdto(savedbookup);
    }

    @Override
    public Bookupdto getbookupByPhone(Long bookupPhone) {
        Bookup bookup = bookuprepository.findById(bookupPhone)
                .orElseThrow(() ->
                        new Bookupnotfound("service with such id doesnot exist" + bookupPhone));

        return bookupmap.maptobookupdto(bookup);
    }

    @Override
    public Bookupdto updatebookup(Long bookupPhone, Bookupdto updatedBookup) {
        Bookup bookup = bookuprepository.findById(bookupPhone).orElseThrow(
                    () -> new Bookupnotfound("service not found with th give id" + bookupPhone));

        bookup.setBooking(updatedBookup.getBooking());
        bookup.setPickup(updatedBookup.getPickup());
        bookup.setServicedone(updatedBookup.getServicedone());

        Bookup updatebookupobj = bookuprepository.save(bookup);

            return bookupmap.maptobookupdto(updatebookupobj);
    }
}