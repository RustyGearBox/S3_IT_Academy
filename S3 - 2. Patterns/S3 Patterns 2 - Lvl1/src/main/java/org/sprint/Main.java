package org.sprint;

import org.sprint.enums.Dough;
import org.sprint.enums.Size;
import org.sprint.builders.PizzaBuilder;
import org.sprint.builders.PizzaMaster;
import org.sprint.builders.PizzaPepperoni;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Pepperoni Pizza
        PizzaBuilder pepperoniBuilder = new PizzaPepperoni()
            .setSize(Size.FAMILIAR)
            .setDough(Dough.THIN)
            .setToppings(List.of("Extra cheese", "Extra pepperoni"));

        PizzaMaster masterPeperoniPizza = new PizzaMaster(pepperoniBuilder);
        Pizza pizzaPepperoni = masterPeperoniPizza.makePizza();

        System.out.println("\n" + "Pizza pepperoni -> " + pizzaPepperoni);


        // Vegetarian Pizza
        PizzaBuilder vegetarianBuilder = new PizzaPepperoni()
            .setSize(Size.LARGE)
            .setDough(Dough.NORMAL)
            .setToppings(List.of("Olives", "Mushrooms", "Cheese"));

        PizzaMaster masterVegetarianPizza = new PizzaMaster(vegetarianBuilder);
        Pizza pizzaVegetarian = masterVegetarianPizza.makePizza();

        System.out.println("Pizza vegetarian -> " + pizzaVegetarian);

    }
}