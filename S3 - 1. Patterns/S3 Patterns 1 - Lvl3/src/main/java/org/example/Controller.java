package org.example;

public class Controller {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeAction() {
        if (command != null) {
            command.execute();
        }
    }

}