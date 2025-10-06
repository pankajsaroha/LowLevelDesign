package com.pankaj.lld.shopping.shipment;

import com.pankaj.lld.shopping.models.ShipmentStatus;

import java.util.Date;

public class ShipmentLog {
    private int shipmentId;
    private ShipmentStatus shipmentStatus;

    public ShipmentLog(int shipmentId, ShipmentStatus shipmentStatus) {
        this.shipmentId = shipmentId;
        this.shipmentStatus = shipmentStatus;
    }
}
