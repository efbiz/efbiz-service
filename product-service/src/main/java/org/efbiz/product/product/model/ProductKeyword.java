package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.product.model.ProductKeywordKey;

public class ProductKeyword extends ProductKeywordKey implements Serializable {
    private BigDecimal relevancyWeight;

    private static final long serialVersionUID = 1L;

    public BigDecimal getRelevancyWeight() {
        return relevancyWeight;
    }

    public void setRelevancyWeight(BigDecimal relevancyWeight) {
        this.relevancyWeight = relevancyWeight;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}