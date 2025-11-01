package com.javapro.pro.service;

import com.javapro.pro.dto.Servicedto;

import java.util.List;

public interface Serviceservice {
    Servicedto createservice (Servicedto servicedto);

    Servicedto getserviceByid(Long serviceId);

    // to get all services
    List<Servicedto> getallservices();

    Servicedto updateservice(Long serviceId, Servicedto updatedservice );

    void deleteservice(Long serviceId);
}
