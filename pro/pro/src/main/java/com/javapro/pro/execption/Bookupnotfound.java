package com.javapro.pro.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class Bookupnotfound extends RuntimeException {
    public Bookupnotfound(String message) {
        super(message);
    }
}
