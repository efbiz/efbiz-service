package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.config.model.ConfigOptionProductOptionKey;

public class ConfigOptionProductOption extends ConfigOptionProductOptionKey implements Serializable {
    private String productOptionId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductOptionId() {
        return productOptionId;
    }

    public void setProductOptionId(String productOptionId) {
        this.productOptionId = productOptionId == null ? null : productOptionId.trim();
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