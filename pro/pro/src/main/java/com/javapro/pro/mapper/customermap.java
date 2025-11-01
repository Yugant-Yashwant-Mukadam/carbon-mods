package com.javapro.pro.mapper;

import com.javapro.pro.dto.Customerdto;
import com.javapro.pro.entity.Customer;

public class customermap {

    public static Customerdto maptocustomerdto (Customer customer){
        return new Customerdto(
                customer.getId(),
                customer.getName(),

                customer.getPhone()

        );
    }
    public static Customer maptocustomer (Customerdto customerdto){
        return new Customer(
                customerdto.getId(),
                customerdto.getName(),

                customerdto.getPhone()
        );
    }

}


