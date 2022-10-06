package com.example;

import jakarta.inject.Singleton;

@Singleton
public class FastEngine implements Engine{
    @Override
    public void start() {
        System.out.println("fast engine start");
    }
}
