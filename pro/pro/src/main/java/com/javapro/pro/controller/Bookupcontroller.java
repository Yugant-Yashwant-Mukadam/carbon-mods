package com.javapro.pro.controller;


import com.javapro.pro.dto.Bookupdto;
import com.javapro.pro.service.Bookupservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/bookup")
public class Bookupcontroller {

    public Bookupservice bookupservice;

    @PostMapping
    public ResponseEntity<Bookupdto> createBookup(@RequestBody Bookupdto bookupdto){
        Bookupdto savedbookup=bookupservice.createBookup(bookupdto);
        return  new ResponseEntity<>(savedbookup, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Bookupdto> getbookupByPhone(@PathVariable("id") Long bookupPhone){
        Bookupdto bookupdto= bookupservice.getbookupByPhone(bookupPhone);
        return ResponseEntity.ok(bookupdto);
    }

    @PutMapping("{phone}")
    public ResponseEntity<Bookupdto> updatebookup(@PathVariable("phone") Long bookupPhone, @RequestBody Bookupdto updatedbookup){
        Bookupdto bookupdto= bookupservice.updatebookup( bookupPhone,updatedbookup);
        return ResponseEntity.ok(bookupdto);
    }
}
