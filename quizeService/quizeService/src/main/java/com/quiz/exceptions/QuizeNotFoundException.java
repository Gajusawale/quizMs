package com.quiz.exceptions;

public class QuizeNotFoundException extends RuntimeException{


    public QuizeNotFoundException(String message) {
        super(message);
    }
}
