package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreFinActSettingKey extends ObjectValue implements Serializable {
    private String productStoreId;

    private String finAccountTypeId;

    private static final long serialVersionUID = 1L;

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getFinAccountTypeId() {
        return finAccountTypeId;
    }

    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId == null ? null : finAccountTypeId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}