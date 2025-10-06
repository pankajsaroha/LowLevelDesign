package com.pankaj.lld.shopping.order;

import com.pankaj.lld.shopping.models.OrderStatus;

import java.util.Date;

public class OrderLog {
    private int orderId;
    private OrderStatus orderStatus;
    private Date orderCreationDate;

    public OrderLog(int orderId, OrderStatus orderStatus, Date orderCreationDate) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderCreationDate = orderCreationDate;
    }
}
