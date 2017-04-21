package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.feature.model.ProductFeatureIactnKey;

public class ProductFeatureIactn extends ProductFeatureIactnKey implements Serializable {
    private String productFeatureIactnTypeId;

    private String productId;

    private static final long serialVersionUID = 1L;

    public String getProductFeatureIactnTypeId() {
        return productFeatureIactnTypeId;
    }

    public void setProductFeatureIactnTypeId(String productFeatureIactnTypeId) {
        this.productFeatureIactnTypeId = productFeatureIactnTypeId == null ? null : productFeatureIactnTypeId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}