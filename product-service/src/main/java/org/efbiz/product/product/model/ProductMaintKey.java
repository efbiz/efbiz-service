package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductMaintKey extends ObjectValue implements Serializable {
    private String productId;

    private String productMaintSeqId;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductMaintSeqId() {
        return productMaintSeqId;
    }

    public void setProductMaintSeqId(String productMaintSeqId) {
        this.productMaintSeqId = productMaintSeqId == null ? null : productMaintSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}