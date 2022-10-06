package com.example;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Singleton
public class AggregateEngine implements Engine{
    @Inject
    private List<Engine> engines;

    @Override
    public void start() {
        engines.forEach(Engine::start);
    }
}
