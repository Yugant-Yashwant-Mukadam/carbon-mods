package com.javapro.pro.service;

import com.javapro.pro.dto.Bookupdto;


public interface Bookupservice {

    Bookupdto createBookup(Bookupdto bookupPhone);

    Bookupdto getbookupByPhone(Long bookupPhone);

    Bookupdto updatebookup(Long bookupPhone, Bookupdto updatedBookup);
}
