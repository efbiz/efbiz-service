package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductFeatureGroup extends ObjectValue implements Serializable {
    private String productFeatureGroupId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId == null ? null : productFeatureGroupId.trim();
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