package com.example.rest.exception;

public class resourcenotfoundException extends RuntimeException 
{
    public resourcenotfoundException(String mgs)
    {
        super(mgs);
    }    
}