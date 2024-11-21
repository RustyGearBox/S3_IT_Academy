package org.sprint.builders;

import org.sprint.Pizza;

public class PizzaMaster {
    
    private PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza() {
        return pizzaBuilder.build();
    }
}
