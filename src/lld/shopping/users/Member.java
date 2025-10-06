package com.pankaj.lld.shopping.users;

public class Member extends Customer {

    public Member (Account account) {
        super (account);
    }

    public boolean placeOrder () {
        return false;
    }
}
