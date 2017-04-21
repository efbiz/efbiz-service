package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductMeterType extends BaseEntity implements Serializable {
    private String productMeterTypeId;

    private String description;

    private String defaultUomId;

    private static final long serialVersionUID = 1L;

    public String getProductMeterTypeId() {
        return productMeterTypeId;
    }

    public void setProductMeterTypeId(String productMeterTypeId) {
        this.productMeterTypeId = productMeterTypeId == null ? null : productMeterTypeId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDefaultUomId() {
        return defaultUomId;
    }

    public void setDefaultUomId(String defaultUomId) {
        this.defaultUomId = defaultUomId == null ? null : defaultUomId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}