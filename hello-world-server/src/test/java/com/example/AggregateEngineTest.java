package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class AggregateEngineTest {
    @Inject
    private AggregateEngine aggregateEngine;

    @Test
    void start() {
        // start aggregate engine
        this.aggregateEngine.start();
    }
}