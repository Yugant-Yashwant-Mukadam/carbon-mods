package com.javapro.pro.controller;

import com.javapro.pro.dto.Servicedto;
import com.javapro.pro.service.Serviceservice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/service")
public class Servicecontroller {

    private Serviceservice serviceservice;

    //api to add service
    @PostMapping
    public ResponseEntity<Servicedto> createservice(@RequestBody Servicedto servicedto){
        Servicedto savedservice=serviceservice.createservice(servicedto);
        return  new ResponseEntity<>(savedservice, HttpStatus.CREATED);
    }
    //api to get service
    @GetMapping("{id}")
    public ResponseEntity<Servicedto> getserviceByid(@PathVariable("id") Long serviceId){
        Servicedto servicedto= serviceservice.getserviceByid(serviceId);
        return ResponseEntity.ok(servicedto);
    }

    //api to get all services
    @GetMapping
    public ResponseEntity<List<Servicedto>> getallservice(){
        List<Servicedto> service= serviceservice.getallservices();
        return ResponseEntity.ok(service);
    }

    //api to updte service
    @PutMapping("{id}")
    public ResponseEntity<Servicedto> updateservice(@PathVariable("id") Long serviceId, @RequestBody Servicedto updatedservice){
        Servicedto servicedto= serviceservice.updateservice(serviceId,updatedservice);
        return ResponseEntity.ok(servicedto);
    }

    //api to delete service
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteservice(@PathVariable("id") Long serviceId){
         serviceservice.deleteservice(serviceId);
        return ResponseEntity.ok("service deleted");
    }

}
