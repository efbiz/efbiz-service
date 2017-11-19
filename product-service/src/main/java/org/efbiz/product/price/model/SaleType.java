package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class SaleType extends ObjectValue implements Serializable {
    private String saleTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(String saleTypeId) {
        this.saleTypeId = saleTypeId == null ? null : saleTypeId.trim();
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