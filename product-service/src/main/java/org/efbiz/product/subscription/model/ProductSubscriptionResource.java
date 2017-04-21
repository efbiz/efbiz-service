package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.subscription.model.ProductSubscriptionResourceKey;

public class ProductSubscriptionResource extends ProductSubscriptionResourceKey implements Serializable {
    private Date thruDate;

    private Date purchaseFromDate;

    private Date purchaseThruDate;

    private BigDecimal maxLifeTime;

    private String maxLifeTimeUomId;

    private BigDecimal availableTime;

    private String availableTimeUomId;

    private BigDecimal useCountLimit;

    private BigDecimal useTime;

    private String useTimeUomId;

    private String useRoleTypeId;

    private String automaticExtend;

    private BigDecimal canclAutmExtTime;

    private String canclAutmExtTimeUomId;

    private BigDecimal gracePeriodOnExpiry;

    private String gracePeriodOnExpiryUomId;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(Date purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public Date getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(Date purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigDecimal getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(BigDecimal maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public String getMaxLifeTimeUomId() {
        return maxLifeTimeUomId;
    }

    public void setMaxLifeTimeUomId(String maxLifeTimeUomId) {
        this.maxLifeTimeUomId = maxLifeTimeUomId == null ? null : maxLifeTimeUomId.trim();
    }

    public BigDecimal getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(BigDecimal availableTime) {
        this.availableTime = availableTime;
    }

    public String getAvailableTimeUomId() {
        return availableTimeUomId;
    }

    public void setAvailableTimeUomId(String availableTimeUomId) {
        this.availableTimeUomId = availableTimeUomId == null ? null : availableTimeUomId.trim();
    }

    public BigDecimal getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigDecimal useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigDecimal getUseTime() {
        return useTime;
    }

    public void setUseTime(BigDecimal useTime) {
        this.useTime = useTime;
    }

    public String getUseTimeUomId() {
        return useTimeUomId;
    }

    public void setUseTimeUomId(String useTimeUomId) {
        this.useTimeUomId = useTimeUomId == null ? null : useTimeUomId.trim();
    }

    public String getUseRoleTypeId() {
        return useRoleTypeId;
    }

    public void setUseRoleTypeId(String useRoleTypeId) {
        this.useRoleTypeId = useRoleTypeId == null ? null : useRoleTypeId.trim();
    }

    public String getAutomaticExtend() {
        return automaticExtend;
    }

    public void setAutomaticExtend(String automaticExtend) {
        this.automaticExtend = automaticExtend == null ? null : automaticExtend.trim();
    }

    public BigDecimal getCanclAutmExtTime() {
        return canclAutmExtTime;
    }

    public void setCanclAutmExtTime(BigDecimal canclAutmExtTime) {
        this.canclAutmExtTime = canclAutmExtTime;
    }

    public String getCanclAutmExtTimeUomId() {
        return canclAutmExtTimeUomId;
    }

    public void setCanclAutmExtTimeUomId(String canclAutmExtTimeUomId) {
        this.canclAutmExtTimeUomId = canclAutmExtTimeUomId == null ? null : canclAutmExtTimeUomId.trim();
    }

    public BigDecimal getGracePeriodOnExpiry() {
        return gracePeriodOnExpiry;
    }

    public void setGracePeriodOnExpiry(BigDecimal gracePeriodOnExpiry) {
        this.gracePeriodOnExpiry = gracePeriodOnExpiry;
    }

    public String getGracePeriodOnExpiryUomId() {
        return gracePeriodOnExpiryUomId;
    }

    public void setGracePeriodOnExpiryUomId(String gracePeriodOnExpiryUomId) {
        this.gracePeriodOnExpiryUomId = gracePeriodOnExpiryUomId == null ? null : gracePeriodOnExpiryUomId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}