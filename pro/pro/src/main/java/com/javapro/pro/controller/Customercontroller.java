package com.javapro.pro.controller;

import com.javapro.pro.dto.Customerdto;
import com.javapro.pro.service.Customerservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class Customercontroller {

    public Customerservice customerservice;


    @PostMapping
    public ResponseEntity<Customerdto> createcustomer(@RequestBody Customerdto customerdto){
    Customerdto savedcustomer=customerservice.createCustomer(customerdto);
    return  new ResponseEntity<>(savedcustomer, HttpStatus.CREATED);
}
    //api to get customer
    @GetMapping("{id}")
    public ResponseEntity<Customerdto> getcustomerByid(@PathVariable("id") Long customerId){
        Customerdto customerdto= customerservice.getCustomerById(customerId);
        return ResponseEntity.ok(customerdto);
    }

    //api to get all customers
    @GetMapping
    public ResponseEntity<List<Customerdto>> getallcustomer(){
        List<Customerdto> customer= customerservice.getAllCustomers();
        return ResponseEntity.ok(customer);
    }

    //api to updte customer
    @PutMapping("{id}")
    public ResponseEntity<Customerdto> updatecustomer(@PathVariable("id") Long customerId, @RequestBody Customerdto updatedcustomer){
        Customerdto customerdto= customerservice.updateCustomer( customerId,updatedcustomer);
        return ResponseEntity.ok(customerdto);
    }

    //api to delete customer
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletecustomer(@PathVariable("id") Long customerId){
        customerservice.deleteCustomer(customerId);
        return ResponseEntity.ok("customer deleted");
    }
}
