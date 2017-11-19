package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductPriceActionType extends ObjectValue implements Serializable {
    private String productPriceActionTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductPriceActionTypeId() {
        return productPriceActionTypeId;
    }

    public void setProductPriceActionTypeId(String productPriceActionTypeId) {
        this.productPriceActionTypeId = productPriceActionTypeId == null ? null : productPriceActionTypeId.trim();
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