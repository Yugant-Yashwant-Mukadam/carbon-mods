package com.javapro.pro.controller;


import com.javapro.pro.dto.Serbookdto;
import com.javapro.pro.dto.Serbookdto;
import com.javapro.pro.service.Customerservice;
import com.javapro.pro.service.Serbookservice;
import com.javapro.pro.service.Serviceservice;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/serbook")
public class Serbookcontroller {

    public final Serbookservice serbookservice;

    @PostMapping
    public ResponseEntity<Serbookdto> createSerbook(@RequestBody Serbookdto serbookdto){
        Serbookdto savedserbook=serbookservice.createSerbook(serbookdto);
        return  new ResponseEntity<>(savedserbook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Serbookdto>> getAllSerbook(){
        List<Serbookdto> serbook= serbookservice.getAllSerbook();
        return ResponseEntity.ok(serbook);
    }
}


