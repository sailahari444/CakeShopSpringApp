package com.cakeshop.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlingException {
    
@ExceptionHandler(value=MethodArgumentNotValidException.class)
public ResponseEntity<String> MethodArgumentNotValidException(MethodArgumentNotValidException mave){
    // System.out.println(mave.getBody());
    // System.out.println(error.getStackTrace());
    return new ResponseEntity<String>("Invalid argument",HttpStatus.NOT_ACCEPTABLE);
}
}
