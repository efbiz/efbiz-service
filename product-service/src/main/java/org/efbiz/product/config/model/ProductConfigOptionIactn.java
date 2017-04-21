package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.config.model.ProductConfigOptionIactnKey;

public class ProductConfigOptionIactn extends ProductConfigOptionIactnKey implements Serializable {
    private String configIactnTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getConfigIactnTypeId() {
        return configIactnTypeId;
    }

    public void setConfigIactnTypeId(String configIactnTypeId) {
        this.configIactnTypeId = configIactnTypeId == null ? null : configIactnTypeId.trim();
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