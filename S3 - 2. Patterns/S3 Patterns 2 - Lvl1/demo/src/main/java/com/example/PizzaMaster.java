package com.example;

import com.example.builders.PizzaBuilder;

public class PizzaMaster {
    
    private PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza() {
        return pizzaBuilder.build();
    }
}
