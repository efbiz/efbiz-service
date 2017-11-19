package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductPriceChange extends ObjectValue implements Serializable {
    private String productPriceChangeId;

    private String productId;

    private String productPriceTypeId;

    private String productPricePurposeId;

    private String currencyUomId;

    private String productStoreGroupId;

    private Date fromDate;

    private Date thruDate;

    private BigDecimal price;

    private BigDecimal oldPrice;

    private Date changedDate;

    private String changedByUserLogin;

    private static final long serialVersionUID = 1L;

    public String getProductPriceChangeId() {
        return productPriceChangeId;
    }

    public void setProductPriceChangeId(String productPriceChangeId) {
        this.productPriceChangeId = productPriceChangeId == null ? null : productPriceChangeId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductPriceTypeId() {
        return productPriceTypeId;
    }

    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId == null ? null : productPriceTypeId.trim();
    }

    public String getProductPricePurposeId() {
        return productPricePurposeId;
    }

    public void setProductPricePurposeId(String productPricePurposeId) {
        this.productPricePurposeId = productPricePurposeId == null ? null : productPricePurposeId.trim();
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId == null ? null : currencyUomId.trim();
    }

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId == null ? null : productStoreGroupId.trim();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedByUserLogin() {
        return changedByUserLogin;
    }

    public void setChangedByUserLogin(String changedByUserLogin) {
        this.changedByUserLogin = changedByUserLogin == null ? null : changedByUserLogin.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}