package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductPriceActionKey extends BaseEntity implements Serializable {
    private String productPriceRuleId;

    private String productPriceActionSeqId;

    private static final long serialVersionUID = 1L;

    public String getProductPriceRuleId() {
        return productPriceRuleId;
    }

    public void setProductPriceRuleId(String productPriceRuleId) {
        this.productPriceRuleId = productPriceRuleId == null ? null : productPriceRuleId.trim();
    }

    public String getProductPriceActionSeqId() {
        return productPriceActionSeqId;
    }

    public void setProductPriceActionSeqId(String productPriceActionSeqId) {
        this.productPriceActionSeqId = productPriceActionSeqId == null ? null : productPriceActionSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}