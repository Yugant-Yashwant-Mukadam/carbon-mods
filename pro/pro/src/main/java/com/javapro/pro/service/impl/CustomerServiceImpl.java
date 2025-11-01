package com.javapro.pro.service.impl;

import com.javapro.pro.dto.Customerdto;
import com.javapro.pro.entity.Customer;
import com.javapro.pro.execption.Customernotfound;
import com.javapro.pro.mapper.customermap;
import com.javapro.pro.repository.customerrepo;
import com.javapro.pro.service.Customerservice;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements Customerservice {

    private customerrepo customerrepository;


    @Override
    public Customerdto createCustomer(Customerdto customerdto) {
        Customer customer = customermap.maptocustomer(customerdto);
        Customer savedcustomer =customerrepository.save(customer);

        return customermap.maptocustomerdto(savedcustomer);
    }

    @Override
    public Customerdto getCustomerById(Long customerId) {
        Customer service=customerrepository.findById(customerId)
                .orElseThrow(()->
                        new Customernotfound("service with such id doesnot exist"+ customerId));

        return customermap.maptocustomerdto(service);

    }

    @Override
    public List<Customerdto> getAllCustomers() {
        List<Customer> customers= customerrepository.findAll();
        return customers.stream().map((customer)-> customermap.maptocustomerdto(customer))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Customerdto updateCustomer(Long customerId, Customerdto updatedCustomer) {
        Customer customer=customerrepository.findById(customerId).orElseThrow(
                ()-> new Customernotfound("service not found with th give id"+customerId));

        customer.setName(updatedCustomer.getName());

        customer.setPhone(updatedCustomer.getPhone());

        Customer updatecustomerobj= customerrepository.save(customer);

        return customermap.maptocustomerdto(updatecustomerobj);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        Customer service=customerrepository.findById(customerId).orElseThrow(
                ()-> new Customernotfound("service not found with th give id"+customerId));
        customerrepository.deleteById(customerId);

    }
}
