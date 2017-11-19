package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductStorePaymentSettingKey extends ObjectValue implements Serializable {
    private String productStoreId;

    private String paymentMethodTypeId;

    private String paymentServiceTypeEnumId;

    private static final long serialVersionUID = 1L;

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId == null ? null : paymentMethodTypeId.trim();
    }

    public String getPaymentServiceTypeEnumId() {
        return paymentServiceTypeEnumId;
    }

    public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId == null ? null : paymentServiceTypeEnumId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}