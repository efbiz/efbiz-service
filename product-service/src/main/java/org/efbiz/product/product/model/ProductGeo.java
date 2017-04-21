package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.product.model.ProductGeoKey;

public class ProductGeo extends ProductGeoKey implements Serializable {
    private String productGeoEnumId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductGeoEnumId() {
        return productGeoEnumId;
    }

    public void setProductGeoEnumId(String productGeoEnumId) {
        this.productGeoEnumId = productGeoEnumId == null ? null : productGeoEnumId.trim();
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