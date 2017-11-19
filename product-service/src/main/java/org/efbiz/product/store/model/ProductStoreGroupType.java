package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreGroupType extends ObjectValue implements Serializable {
    private String productStoreGroupTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductStoreGroupTypeId() {
        return productStoreGroupTypeId;
    }

    public void setProductStoreGroupTypeId(String productStoreGroupTypeId) {
        this.productStoreGroupTypeId = productStoreGroupTypeId == null ? null : productStoreGroupTypeId.trim();
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