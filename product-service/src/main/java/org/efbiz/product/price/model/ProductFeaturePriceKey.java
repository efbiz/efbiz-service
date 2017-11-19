package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductFeaturePriceKey extends ObjectValue implements Serializable {
    private String productFeatureId;

    private String productPriceTypeId;

    private String currencyUomId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId == null ? null : productFeatureId.trim();
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId == null ? null : productPriceTypeId.trim();
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId == null ? null : currencyUomId.trim();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}