package org.sprint;

import java.util.List;

import org.sprint.enums.Size;
import org.sprint.enums.Dough;

public class Pizza {
    
    private Size size;
    private Dough dough;
    private List<String> toppings;
    
    public Pizza(Size size, Dough dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "size: " + size + ", dough: " + dough + ", toppings: " + toppings;
    }

}