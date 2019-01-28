package com.stackroute.controller;

import com.stackroute.exception.IdNotFoundException;
import com.stackroute.exception.TracNotFoundException;
import com.stackroute.exception.TrackAlreadyExistsException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice

public class GlobalExceptionHandler {

    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Not all mandatory fields are filled")
    @ExceptionHandler(IdNotFoundException.class)
    public void handleEmptyFieldException(IdNotFoundException e){

        System.out.println("Id is not found"+e);
//        log.error("Not all mandatory fields are filled", e);
    }

    @ResponseStatus(value= HttpStatus.CONFLICT, reason="User already exists")
    @ExceptionHandler(TrackAlreadyExistsException.class)
    public void handleUserAlreadyExistsException(TrackAlreadyExistsException e){
//        log.error("Track already exists", e);
        System.out.println("Track already exists"+e);
    }

    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="User does not exist")
    @ExceptionHandler(TracNotFoundException.class)
    public void handleUserDoesNotExistException(TracNotFoundException e){
//        log.error("Track does not exist", e);
        System.out.println("Track not found"+e);
    }
}