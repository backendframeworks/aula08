package com.backend.aula08.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
        super("Produto não existe!");
    }
}
