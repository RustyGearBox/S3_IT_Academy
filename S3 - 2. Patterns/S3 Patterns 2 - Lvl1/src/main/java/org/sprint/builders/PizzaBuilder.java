package org.sprint.builders;

import org.sprint.Pizza;
import org.sprint.enums.Size;
import org.sprint.enums.Dough;

import java.util.List;

public interface PizzaBuilder {
    
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder setToppings(List<String> toppings);
    Pizza build();

}