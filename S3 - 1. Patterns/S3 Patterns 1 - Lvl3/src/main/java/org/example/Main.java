package org.example;

public class Main {
    public static void main(String[] args) {

        // Vehicle car = new Car();
        Vehicle bicyle = new Bicycle();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();

        Command startUp = new startUpCommand(plane);
        Command accelerate = new accelerateCommand(ship);
        Command slowDown = new slowDownCommand(bicyle);

        Controller controller = new Controller();

        controller.setCommand(startUp);
        controller.executeAction();

        controller.setCommand(accelerate);
        controller.executeAction();

        controller.setCommand(slowDown);
        controller.executeAction();

    }
}