package com.pankaj.lld.shopping.users;

import com.pankaj.lld.shopping.models.Address;

public class Account {
    private String name;
    private String phone;
    private String email;
    private String password;
    private Address address;

    public Account(String name, String phone, String email, String password, Address address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public Address getShippingAddress() {
        return address;
    }

    public boolean addProductReview () {
        return false;
    }

    public boolean addProduct () {
        return false;
    }
}
