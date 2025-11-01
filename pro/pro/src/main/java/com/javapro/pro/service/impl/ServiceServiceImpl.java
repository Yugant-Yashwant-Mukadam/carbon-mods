package com.javapro.pro.service.impl;

import com.javapro.pro.dto.Servicedto;
import com.javapro.pro.entity.Service;
import com.javapro.pro.execption.Servicenotfound;
import com.javapro.pro.mapper.servicemap;
import com.javapro.pro.repository.servicerepo;
import com.javapro.pro.service.Serviceservice;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements Serviceservice {

    private servicerepo servicerepository;

    @Override
    public Servicedto createservice(Servicedto servicedto) {

        Service service = servicemap.maptoservice(servicedto);
        Service savedservice =servicerepository.save(service);

        return servicemap.maptoservicedto(savedservice);
    }

    @Override
    public Servicedto getserviceByid(Long serviceId) {
        Service service=servicerepository.findById(serviceId)
                .orElseThrow(()->
                        new Servicenotfound("service with such id doesnot exist"+ serviceId));

        return servicemap.maptoservicedto(service);
    }

    @Override
    public List<Servicedto> getallservices() {
        List<Service> services= servicerepository.findAll();
        return services.stream().map((service)-> servicemap.maptoservicedto(service))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Servicedto updateservice(Long serviceId, Servicedto updatedservice) {
        Service service=servicerepository.findById(serviceId).orElseThrow(
                ()-> new Servicenotfound("service not found with th give id"+serviceId));

        service.setSer_name(updatedservice.getSer_name());
        service.setSer_des(updatedservice.getSer_des());


        Service updateserviceobj= servicerepository.save(service);

        return servicemap.maptoservicedto(updateserviceobj);
    }

    @Override
    public void deleteservice(Long serviceId) {
        Service service=servicerepository.findById(serviceId).orElseThrow(
                ()-> new Servicenotfound("service not found with th give id"+serviceId));
        servicerepository.deleteById(serviceId);
    }
}
