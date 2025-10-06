package com.pankaj.lld.shopping.users;

public class Guest extends Customer {

    public Guest(Account account) {
        super(account);
    }

    public boolean register () {
        return false;
    }
}
