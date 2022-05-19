package com.dio.sistemaBancariodio.exception;

public class ExceptionInsufficientFunds extends RuntimeException{

    public ExceptionInsufficientFunds(String msg){
        super(msg);
    }
}
