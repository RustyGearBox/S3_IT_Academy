package com.example.builders;

import java.util.List;

import com.example.Pizza;
import com.example.attributes.Dough;
import com.example.attributes.Size;

public interface PizzaBuilder {
    
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder setToppings(List<String> toppings);
    Pizza build();

}