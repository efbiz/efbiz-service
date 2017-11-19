package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreVendorShipmentKey extends ObjectValue implements Serializable {
    private String productStoreId;

    private String vendorPartyId;

    private String shipmentMethodTypeId;

    private String carrierPartyId;

    private static final long serialVersionUID = 1L;

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(String vendorPartyId) {
        this.vendorPartyId = vendorPartyId == null ? null : vendorPartyId.trim();
    }

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId == null ? null : shipmentMethodTypeId.trim();
    }

    public String getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(String carrierPartyId) {
        this.carrierPartyId = carrierPartyId == null ? null : carrierPartyId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}