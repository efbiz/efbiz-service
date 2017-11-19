package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductPromoCondKey extends ObjectValue implements Serializable {
    private String productPromoId;

    private String productPromoRuleId;

    private String productPromoCondSeqId;

    private static final long serialVersionUID = 1L;

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId == null ? null : productPromoId.trim();
    }

    public String getProductPromoRuleId() {
        return productPromoRuleId;
    }

    public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId == null ? null : productPromoRuleId.trim();
    }

    public String getProductPromoCondSeqId() {
        return productPromoCondSeqId;
    }

    public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        this.productPromoCondSeqId = productPromoCondSeqId == null ? null : productPromoCondSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}