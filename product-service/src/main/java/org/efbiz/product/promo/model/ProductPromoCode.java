package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductPromoCode extends ObjectValue implements Serializable {
    private String productPromoCodeId;

    private String productPromoId;

    private String userEntered;

    private String requireEmailOrParty;

    private BigDecimal useLimitPerCode;

    private BigDecimal useLimitPerCustomer;

    private Date fromDate;

    private Date thruDate;

    private Date createdDate;

    private String createdByUserLogin;

    private Date lastModifiedDate;

    private String lastModifiedByUserLogin;

    private static final long serialVersionUID = 1L;

    public String getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId == null ? null : productPromoCodeId.trim();
    }

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId == null ? null : productPromoId.trim();
    }

    public String getUserEntered() {
        return userEntered;
    }

    public void setUserEntered(String userEntered) {
        this.userEntered = userEntered == null ? null : userEntered.trim();
    }

    public String getRequireEmailOrParty() {
        return requireEmailOrParty;
    }

    public void setRequireEmailOrParty(String requireEmailOrParty) {
        this.requireEmailOrParty = requireEmailOrParty == null ? null : requireEmailOrParty.trim();
    }

    public BigDecimal getUseLimitPerCode() {
        return useLimitPerCode;
    }

    public void setUseLimitPerCode(BigDecimal useLimitPerCode) {
        this.useLimitPerCode = useLimitPerCode;
    }

    public BigDecimal getUseLimitPerCustomer() {
        return useLimitPerCustomer;
    }

    public void setUseLimitPerCustomer(BigDecimal useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin == null ? null : createdByUserLogin.trim();
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin == null ? null : lastModifiedByUserLogin.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}