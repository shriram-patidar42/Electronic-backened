package com.ram.electronic.store.exceptions;

import lombok.Builder;

@Builder
public class  ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found !!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
