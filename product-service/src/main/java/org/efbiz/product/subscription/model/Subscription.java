package org.efbiz.product.subscription.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class Subscription extends ObjectValue implements Serializable {
    private String subscriptionId;

    private String description;

    private String subscriptionResourceId;

    private String communicationEventId;

    private String contactMechId;

    private String originatedFromPartyId;

    private String originatedFromRoleTypeId;

    private String partyId;

    private String roleTypeId;

    private String partyNeedId;

    private String needTypeId;

    private String orderId;

    private String orderItemSeqId;

    private String productId;

    private String productCategoryId;

    private String inventoryItemId;

    private String subscriptionTypeId;

    private String externalSubscriptionId;

    private Date fromDate;

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

    private String automaticExtend;

    private BigDecimal canclAutmExtTime;

    private String canclAutmExtTimeUomId;

    private BigDecimal gracePeriodOnExpiry;

    private String gracePeriodOnExpiryUomId;

    private Date expirationCompletedDate;

    private static final long serialVersionUID = 1L;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId == null ? null : subscriptionId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSubscriptionResourceId() {
        return subscriptionResourceId;
    }

    public void setSubscriptionResourceId(String subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId == null ? null : subscriptionResourceId.trim();
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId == null ? null : communicationEventId.trim();
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId == null ? null : contactMechId.trim();
    }

    public String getOriginatedFromPartyId() {
        return originatedFromPartyId;
    }

    public void setOriginatedFromPartyId(String originatedFromPartyId) {
        this.originatedFromPartyId = originatedFromPartyId == null ? null : originatedFromPartyId.trim();
    }

    public String getOriginatedFromRoleTypeId() {
        return originatedFromRoleTypeId;
    }

    public void setOriginatedFromRoleTypeId(String originatedFromRoleTypeId) {
        this.originatedFromRoleTypeId = originatedFromRoleTypeId == null ? null : originatedFromRoleTypeId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId == null ? null : roleTypeId.trim();
    }

    public String getPartyNeedId() {
        return partyNeedId;
    }

    public void setPartyNeedId(String partyNeedId) {
        this.partyNeedId = partyNeedId == null ? null : partyNeedId.trim();
    }

    public String getNeedTypeId() {
        return needTypeId;
    }

    public void setNeedTypeId(String needTypeId) {
        this.needTypeId = needTypeId == null ? null : needTypeId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId == null ? null : orderItemSeqId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId == null ? null : inventoryItemId.trim();
    }

    public String getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(String subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId == null ? null : subscriptionTypeId.trim();
    }

    public String getExternalSubscriptionId() {
        return externalSubscriptionId;
    }

    public void setExternalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId == null ? null : externalSubscriptionId.trim();
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

    public Date getExpirationCompletedDate() {
        return expirationCompletedDate;
    }

    public void setExpirationCompletedDate(Date expirationCompletedDate) {
        this.expirationCompletedDate = expirationCompletedDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}