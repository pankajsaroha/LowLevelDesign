package com.pankaj.lld.shopping.models;

public class Address {
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }

    private String pin;

    public Address(String street, String city, String state, String pin) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }
}
