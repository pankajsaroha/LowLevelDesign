package com.pankaj.lld.shopping.payment;

public interface PaymentStrategy {
    boolean pay(int orderId);
}
