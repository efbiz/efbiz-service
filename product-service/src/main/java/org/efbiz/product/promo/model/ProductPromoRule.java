package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.promo.model.ProductPromoRuleKey;

public class ProductPromoRule extends ProductPromoRuleKey implements Serializable {
    private String ruleName;

    private static final long serialVersionUID = 1L;

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}