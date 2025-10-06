package com.pankaj.lld.shopping.order;

import com.pankaj.lld.shopping.models.OrderStatus;

import java.util.Date;

public class Order {
    private int orderId;
    private OrderStatus orderStatus;
    private Date orderCreationDate;

    public Order(int orderId, OrderStatus orderStatus, Date orderCreationDate) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderCreationDate = orderCreationDate;
    }

    public boolean makePayment () {
        return false;
    }

    public boolean sendForShipment () {
        return false;
    }

    public boolean sendOrderLog () {
        return false;
    }
}
