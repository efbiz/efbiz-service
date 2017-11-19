package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductFeatureIactnKey extends ObjectValue implements Serializable {
    private String productFeatureId;

    private String productFeatureIdTo;

    private static final long serialVersionUID = 1L;

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId == null ? null : productFeatureId.trim();
    }

    public String getProductFeatureIdTo() {
        return productFeatureIdTo;
    }

    public void setProductFeatureIdTo(String productFeatureIdTo) {
        this.productFeatureIdTo = productFeatureIdTo == null ? null : productFeatureIdTo.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}