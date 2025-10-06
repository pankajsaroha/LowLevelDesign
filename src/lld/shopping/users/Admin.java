package com.pankaj.lld.shopping.users;

public class Admin extends Customer {

    public Admin (Account account) {
        super (account);
    }

    public boolean blockUser (String userEmailOrPhone) {
        return false;
    }

    public boolean unblockUser (String userEmailOrPhone) {
        return false;
    }

    public boolean addProductCategory (String productCategory) {
        return false;
    }

    public boolean modifyProductCategory (String productCategory) {
        return false;
    }

    public boolean removeProductCategory (String productCategory) {
        return false;
    }
}
