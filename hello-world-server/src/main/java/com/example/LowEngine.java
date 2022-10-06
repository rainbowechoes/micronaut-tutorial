package com.example;


import jakarta.inject.Singleton;

@Singleton
public class LowEngine implements Engine{
    @Override
    public void start() {
        System.out.println("low engine start");
    }
}
