package com.exceptions;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException( ){
        super();
    }

    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}