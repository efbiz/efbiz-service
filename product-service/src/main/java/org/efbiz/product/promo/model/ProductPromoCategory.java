package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.promo.model.ProductPromoCategoryKey;

public class ProductPromoCategory extends ProductPromoCategoryKey implements Serializable {
    private String productPromoApplEnumId;

    private String includeSubCategories;

    private static final long serialVersionUID = 1L;

    public String getProductPromoApplEnumId() {
        return productPromoApplEnumId;
    }

    public void setProductPromoApplEnumId(String productPromoApplEnumId) {
        this.productPromoApplEnumId = productPromoApplEnumId == null ? null : productPromoApplEnumId.trim();
    }

    public String getIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(String includeSubCategories) {
        this.includeSubCategories = includeSubCategories == null ? null : includeSubCategories.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}