package com.Myproject.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class studentNotFound extends RuntimeException{
    public studentNotFound(String message) {
        super(message);
    }
}
