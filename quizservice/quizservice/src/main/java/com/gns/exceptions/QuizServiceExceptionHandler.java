package com.gns.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class QuizServiceExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
     @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleInvalidArgumenet(MethodArgumentNotValidException ex )
     {
         Map<String,String> errorMap=new HashMap<>();

         ex.getBindingResult().getFieldErrors().forEach(error ->{
             errorMap.put(error.getField(),error.getDefaultMessage());
     });

         return errorMap;


     }

     @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(QuizeNotFoundException.class)
    public Map<String ,String>  handleNotFoundException(QuizeNotFoundException ex)
    {
        Map<String,String> errorMap=new HashMap<>();

        errorMap.put("errorMessage",ex.getMessage());

        return errorMap;

    }

}
