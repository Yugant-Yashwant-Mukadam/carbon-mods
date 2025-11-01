package com.javapro.pro.mapper;

import com.javapro.pro.dto.Servicedto;
import com.javapro.pro.entity.Service;

public class servicemap {

    public static Servicedto maptoservicedto (Service service){
        return new Servicedto(
                service.getId(),
                service.getSer_name(),
                service.getSer_des(),
                service.getSer_code()

        );
    }
    public static Service maptoservice (Servicedto servicedto){
        return new Service(
                servicedto.getId(),
                servicedto.getSer_name(),
                servicedto.getSer_des(),
                servicedto.getSer_code()
        );
    }

}




