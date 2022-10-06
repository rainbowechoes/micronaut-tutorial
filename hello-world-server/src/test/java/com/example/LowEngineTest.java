package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class LowEngineTest {
    @Inject
    private LowEngine lowEngine;

    @Inject
    private ApplicationContext applicationContext;

    @Test
    void start() {
        Engine engine = this.applicationContext.getBean(Engine.class);
        engine.start();

        this.lowEngine.start();
    }
}