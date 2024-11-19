package org.example;

public interface PhoneNumber {
    String getFormattedNumber();
}

class SpanishPhoneNumber implements PhoneNumber{

    private String number;

    public SpanishPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String getFormattedNumber() {
        return "+34 " + number;
    }
}

class USPhoneNumber implements PhoneNumber{

    private String number;

    public USPhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String getFormattedNumber() {
        return "+1 " + number;
    }
}
