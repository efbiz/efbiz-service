package org.efbiz.product.supplier.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class SupplierRatingType extends ObjectValue implements Serializable {
    private String supplierRatingTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getSupplierRatingTypeId() {
        return supplierRatingTypeId;
    }

    public void setSupplierRatingTypeId(String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId == null ? null : supplierRatingTypeId.trim();
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