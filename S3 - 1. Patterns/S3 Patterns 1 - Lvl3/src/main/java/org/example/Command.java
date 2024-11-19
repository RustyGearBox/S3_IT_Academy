package org.example;

public interface Command {

    void execute();

}

class startUpCommand implements Command {

    private Vehicle vehicle;

    public startUpCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.startUp();
    }
}

class accelerateCommand implements Command {

    private Vehicle vehicle;

    public accelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}

class slowDownCommand implements Command {

    private Vehicle vehicle;

    public slowDownCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.slowDown();
    }
}