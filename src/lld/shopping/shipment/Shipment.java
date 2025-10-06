package com.pankaj.lld.shopping.shipment;

import com.pankaj.lld.shopping.models.ShipmentStatus;

import java.util.Date;

public class Shipment {
    private int shipmentId;
    private ShipmentStatus shipmentStatus;
    private Date shippingDate;
    private Date estimatedDelivery;
    private ShipmentLog shipmentLog;

    public Shipment(int shipmentId, ShipmentStatus shipmentStatus, Date shippingDate, Date estimatedDelivery, ShipmentLog shipmentLog) {
        this.shipmentId = shipmentId;
        this.shipmentStatus = shipmentStatus;
        this.shippingDate = shippingDate;
        this.estimatedDelivery = estimatedDelivery;
        this.shipmentLog = shipmentLog;
    }
}
