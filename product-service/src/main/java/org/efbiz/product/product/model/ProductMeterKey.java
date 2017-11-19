package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductMeterKey extends ObjectValue implements Serializable {
    private String productId;

    private String productMeterTypeId;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductMeterTypeId() {
        return productMeterTypeId;
    }

    public void setProductMeterTypeId(String productMeterTypeId) {
        this.productMeterTypeId = productMeterTypeId == null ? null : productMeterTypeId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}