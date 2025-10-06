package com.pankaj.lld.shopping.payment.impl;

import com.pankaj.lld.shopping.payment.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(int orderId) {
        return false;
    }
}
