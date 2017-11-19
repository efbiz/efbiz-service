package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductFeatureDataResourceKey extends ObjectValue implements Serializable {
    private String dataResourceId;

    private String productFeatureId;

    private static final long serialVersionUID = 1L;

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId == null ? null : dataResourceId.trim();
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId == null ? null : productFeatureId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}