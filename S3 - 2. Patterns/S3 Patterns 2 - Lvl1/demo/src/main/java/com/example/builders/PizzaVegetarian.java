package com.example.builders;

import java.util.List;

import com.example.Pizza;
import com.example.attributes.Dough;
import com.example.attributes.Size;

public class PizzaVegetarian implements PizzaBuilder{
    
    private Size size;
    private Dough dough;
    private List<String> toppings;

    public PizzaVegetarian() {
        this.size = Size.LARGE;
        this.dough = Dough.NORMAL;
        this.toppings = List.of();
    }

    public PizzaBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }
    
    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }

}