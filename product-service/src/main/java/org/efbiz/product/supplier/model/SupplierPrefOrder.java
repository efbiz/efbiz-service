package org.efbiz.product.supplier.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class SupplierPrefOrder extends ObjectValue implements Serializable {
    private String supplierPrefOrderId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getSupplierPrefOrderId() {
        return supplierPrefOrderId;
    }

    public void setSupplierPrefOrderId(String supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId == null ? null : supplierPrefOrderId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}