package org.example;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private List<Address> addresses = new ArrayList<>();
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addContact(ContactFactory contactFactory, String street, String postal, String city, String number) {
        Address address = contactFactory.createAddress(street, postal, city);
        PhoneNumber phoneNumber = contactFactory.createPhoneNumber(number);

        addresses.add(address);
        phoneNumbers.add(phoneNumber);

        System.out.println("Contact added!");
        System.out.println("Address: " + address.getFullAddress());
        System.out.println("PhoneNumber: " + phoneNumber.getFormattedNumber());
    }



}
