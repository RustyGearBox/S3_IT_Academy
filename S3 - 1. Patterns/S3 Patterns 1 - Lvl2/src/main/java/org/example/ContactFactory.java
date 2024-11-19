package org.example;

public interface ContactFactory {

    Address createAddress(String street, String postal,String city);
    PhoneNumber createPhoneNumber(String number);

}

class SpanishContactFactory implements ContactFactory{

    @Override
    public Address createAddress(String street, String postal, String city) {
        return new SpanishAddress(street, postal, city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhoneNumber(number);
    }
}

class USContactFactory implements ContactFactory{

    @Override
    public Address createAddress(String street, String postal, String city) {
        return new USAddress(street, postal, city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new USPhoneNumber(number);
    }
}