package org.example;

public interface Address {
    String getFullAddress();
}

class SpanishAddress implements Address {

    private String street;
    private String postal;
    private String city;

    public SpanishAddress(String street, String postal, String city) {
        this.street = street;
        this.postal = postal;
        this.city = city;
    }

    @Override
    public String getFullAddress() {
        return "Spanish address - street: " + street + ", postal code: " + postal + ", city: " + city;
    }
}

class USAddress implements Address{

    private String street;
    private String postal;
    private String city;

    public USAddress(String street, String postal, String city) {
        this.street = street;
        this.postal = postal;
        this.city = city;
    }

    @Override
    public String getFullAddress() {
        return "USA address - street: " + street + ", postal code: " + postal + ", city: " + city;
    }
}