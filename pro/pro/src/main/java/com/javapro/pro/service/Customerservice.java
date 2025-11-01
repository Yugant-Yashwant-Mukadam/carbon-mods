package com.javapro.pro.service;

import com.javapro.pro.dto.Customerdto;
import java.util.List;

public interface Customerservice {

    // Create a new customer
    Customerdto createCustomer(Customerdto customerdto);

    // Get a single customer by ID
    Customerdto getCustomerById(Long customerId);

    // Get all customers
    List<Customerdto> getAllCustomers();

    // Update a customer by ID
    Customerdto updateCustomer(Long customerId, Customerdto updatedCustomer);

    // Delete a customer by ID
    void deleteCustomer(Long customerId);
}
