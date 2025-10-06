package com.pankaj.lld.shopping.cart;

public class Item {
    private int quantity;
    private double price;
    private Product product;

    public Item(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public boolean updateQuantity () {
        return false;
    }
}
