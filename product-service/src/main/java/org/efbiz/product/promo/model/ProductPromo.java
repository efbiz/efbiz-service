package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductPromo extends BaseEntity implements Serializable {
    private String productPromoId;

    private String promoName;

    private String promoText;

    private String userEntered;

    private String showToCustomer;

    private String requireCode;

    private BigDecimal useLimitPerOrder;

    private BigDecimal useLimitPerCustomer;

    private BigDecimal useLimitPerPromotion;

    private BigDecimal billbackFactor;

    private String overrideOrgPartyId;

    private Date createdDate;

    private String createdByUserLogin;

    private Date lastModifiedDate;

    private String lastModifiedByUserLogin;

    private static final long serialVersionUID = 1L;

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId == null ? null : productPromoId.trim();
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName == null ? null : promoName.trim();
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText == null ? null : promoText.trim();
    }

    public String getUserEntered() {
        return userEntered;
    }

    public void setUserEntered(String userEntered) {
        this.userEntered = userEntered == null ? null : userEntered.trim();
    }

    public String getShowToCustomer() {
        return showToCustomer;
    }

    public void setShowToCustomer(String showToCustomer) {
        this.showToCustomer = showToCustomer == null ? null : showToCustomer.trim();
    }

    public String getRequireCode() {
        return requireCode;
    }

    public void setRequireCode(String requireCode) {
        this.requireCode = requireCode == null ? null : requireCode.trim();
    }

    public BigDecimal getUseLimitPerOrder() {
        return useLimitPerOrder;
    }

    public void setUseLimitPerOrder(BigDecimal useLimitPerOrder) {
        this.useLimitPerOrder = useLimitPerOrder;
    }

    public BigDecimal getUseLimitPerCustomer() {
        return useLimitPerCustomer;
    }

    public void setUseLimitPerCustomer(BigDecimal useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
    }

    public BigDecimal getUseLimitPerPromotion() {
        return useLimitPerPromotion;
    }

    public void setUseLimitPerPromotion(BigDecimal useLimitPerPromotion) {
        this.useLimitPerPromotion = useLimitPerPromotion;
    }

    public BigDecimal getBillbackFactor() {
        return billbackFactor;
    }

    public void setBillbackFactor(BigDecimal billbackFactor) {
        this.billbackFactor = billbackFactor;
    }

    public String getOverrideOrgPartyId() {
        return overrideOrgPartyId;
    }

    public void setOverrideOrgPartyId(String overrideOrgPartyId) {
        this.overrideOrgPartyId = overrideOrgPartyId == null ? null : overrideOrgPartyId.trim();
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