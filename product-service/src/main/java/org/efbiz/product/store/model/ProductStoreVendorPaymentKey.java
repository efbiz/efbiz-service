package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreVendorPaymentKey extends ObjectValue implements Serializable {
    private String productStoreId;

    private String vendorPartyId;

    private String paymentMethodTypeId;

    private String creditCardEnumId;

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

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId == null ? null : paymentMethodTypeId.trim();
    }

    public String getCreditCardEnumId() {
        return creditCardEnumId;
    }

    public void setCreditCardEnumId(String creditCardEnumId) {
        this.creditCardEnumId = creditCardEnumId == null ? null : creditCardEnumId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}