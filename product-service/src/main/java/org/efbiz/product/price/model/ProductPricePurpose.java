package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductPricePurpose extends ObjectValue implements Serializable {
    private String productPricePurposeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId == null ? null : productPricePurposeId.trim();
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