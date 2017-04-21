package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductPromoProductKey extends BaseEntity implements Serializable {
    private String productPromoId;

    private String productPromoRuleId;

    private String productPromoActionSeqId;

    private String productPromoCondSeqId;

    private String productId;

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

    public String getProductPromoActionSeqId() {
        return productPromoActionSeqId;
    }

    public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        this.productPromoActionSeqId = productPromoActionSeqId == null ? null : productPromoActionSeqId.trim();
    }

    public String getProductPromoCondSeqId() {
        return productPromoCondSeqId;
    }

    public void setProductPromoCondSeqId(String productPromoCondSeqId) {
        this.productPromoCondSeqId = productPromoCondSeqId == null ? null : productPromoCondSeqId.trim();
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