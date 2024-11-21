package com.example;

import java.util.List;

import com.example.attributes.Dough;
import com.example.attributes.Size;
import com.example.builders.PizzaBuilder;
import com.example.builders.PizzaPepperoni;

public class Main {
    public static void main(String[] args) {
        
        // Pepperoni Pizza
        PizzaBuilder pepperoniBuilder = new PizzaPepperoni()
            .setSize(Size.FAMILIAR)
            .setDough(Dough.THIN)
            .setToppings(List.of("Wakamole", "Extra Pepperoni"));

        PizzaMaster masterPeperoniPizza = new PizzaMaster(pepperoniBuilder);
        Pizza pizzaPepperoni = masterPeperoniPizza.makePizza();

        System.out.println("\n Pizza pepperoni: " + pizzaPepperoni);


        // Vegetarian Pizza
        PizzaBuilder vegetarianBuilder = new PizzaPepperoni()
            .setSize(Size.LARGE)
            .setDough(Dough.NORMAL)
            .setToppings(List.of("Olives", "Mushrooms", "Cheese"));

        PizzaMaster masterVegetarianPizza = new PizzaMaster(vegetarianBuilder);
        Pizza pizzaVegetarian = masterVegetarianPizza.makePizza();

        System.out.println("\n Pizza pepperoni: " + pizzaVegetarian + "\n");

    }
}