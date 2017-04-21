package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductPriceCondKey extends BaseEntity implements Serializable {
    private String productPriceRuleId;

    private String productPriceCondSeqId;

    private static final long serialVersionUID = 1L;

    public String getProductPriceRuleId() {
        return productPriceRuleId;
    }

    public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId == null ? null : productPriceRuleId.trim();
    }

    public String getProductPriceCondSeqId() {
        return productPriceCondSeqId;
    }

    public void setProductPriceCondSeqId(String productPriceCondSeqId) {
        this.productPriceCondSeqId = productPriceCondSeqId == null ? null : productPriceCondSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}