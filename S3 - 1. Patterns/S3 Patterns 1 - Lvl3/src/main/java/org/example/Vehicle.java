package org.example;

public interface Vehicle {

    void startUp();
    void accelerate();
    void slowDown();

}

class Car implements Vehicle {

    @Override
    public void startUp() {
        System.out.println("Car: The car is starting up");
    }

    @Override
    public void accelerate() {
        System.out.println("Car: The car is accelerating");
    }

    @Override
    public void slowDown() {
        System.out.println("Car: The car is reducing his speed");
    }
}

class Bicycle implements Vehicle {

    @Override
    public void startUp() {
        System.out.println("Bicycle: The bicycle is catching speed");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle: It's accelerating ");
    }

    @Override
    public void slowDown() {
        System.out.println("Bicycle: The breaks are not working...");
    }
}

class Plane implements Vehicle {

    @Override
    public void startUp() {
        System.out.println("Plane: Warming the engines!");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane: It's accelerating");
    }

    @Override
    public void slowDown() {
        System.out.println("Plane: ¿How do the planes slow down?");
    }
}

class Ship implements Vehicle {

    @Override
    public void startUp() {
        System.out.println("Ship: Is taking forever to start up");
    }

    @Override
    public void accelerate() {
        System.out.println("Ship: Wow, I would go faster by swimming...");
    }

    @Override
    public void slowDown() {
        System.out.println("Ship: Is this really moving, I don't know if we are accelerating or what...");
    }
}

