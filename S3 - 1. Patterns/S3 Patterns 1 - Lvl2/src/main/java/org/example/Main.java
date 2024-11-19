package org.example;

public class Main {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        ContactFactory spanishFactory = new SpanishContactFactory();
        manager.addContact(spanishFactory, "Av. Diagonal", "08021", "Barcelona", "663586249");

        ContactFactory usFactory = new USContactFactory();
        manager.addContact(usFactory, "Ocean Avenue", "7","Santa Monica", "2648591513");
    }
}