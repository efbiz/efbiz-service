package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.promo.model.ProductPromoProductKey;

public class ProductPromoProduct extends ProductPromoProductKey implements Serializable {
    private String productPromoApplEnumId;

    private static final long serialVersionUID = 1L;

    public String getProductPromoApplEnumId() {
        return productPromoApplEnumId;
    }

    public void setProductPromoApplEnumId(String productPromoApplEnumId) {
        this.productPromoApplEnumId = productPromoApplEnumId == null ? null : productPromoApplEnumId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}