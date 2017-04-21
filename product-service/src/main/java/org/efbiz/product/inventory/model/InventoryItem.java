package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class InventoryItem extends BaseEntity implements Serializable {
    private String inventoryItemId;

    private String inventoryItemTypeId;

    private String productId;

    private String partyId;

    private String ownerPartyId;

    private String statusId;

    private Date datetimeReceived;

    private Date datetimeManufactured;

    private Date expireDate;

    private String facilityId;

    private String containerId;

    private String lotId;

    private String uomId;

    private String binNumber;

    private String locationSeqId;

    private String comments;

    private BigDecimal quantityOnHandTotal;

    private BigDecimal availableToPromiseTotal;

    private BigDecimal accountingQuantityTotal;

    private BigDecimal quantityOnHand;

    private BigDecimal availableToPromise;

    private String serialNumber;

    private String softIdentifier;

    private String activationNumber;

    private Date activationValidThru;

    private BigDecimal unitCost;

    private String currencyUomId;

    private String fixedAssetId;

    private static final long serialVersionUID = 1L;

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId == null ? null : inventoryItemId.trim();
    }

    public String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }

    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId == null ? null : inventoryItemTypeId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId == null ? null : ownerPartyId.trim();
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }

    public Date getDatetimeReceived() {
        return datetimeReceived;
    }

    public void setDatetimeReceived(Date datetimeReceived) {
        this.datetimeReceived = datetimeReceived;
    }

    public Date getDatetimeManufactured() {
        return datetimeManufactured;
    }

    public void setDatetimeManufactured(Date datetimeManufactured) {
        this.datetimeManufactured = datetimeManufactured;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId == null ? null : containerId.trim();
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId == null ? null : lotId.trim();
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId == null ? null : uomId.trim();
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber == null ? null : binNumber.trim();
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId == null ? null : locationSeqId.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public BigDecimal getQuantityOnHandTotal() {
        return quantityOnHandTotal;
    }

    public void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
    }

    public BigDecimal getAvailableToPromiseTotal() {
        return availableToPromiseTotal;
    }

    public void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }

    public BigDecimal getAccountingQuantityTotal() {
        return accountingQuantityTotal;
    }

    public void setAccountingQuantityTotal(BigDecimal accountingQuantityTotal) {
        this.accountingQuantityTotal = accountingQuantityTotal;
    }

    public BigDecimal getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(BigDecimal quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public BigDecimal getAvailableToPromise() {
        return availableToPromise;
    }

    public void setAvailableToPromise(BigDecimal availableToPromise) {
        this.availableToPromise = availableToPromise;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getSoftIdentifier() {
        return softIdentifier;
    }

    public void setSoftIdentifier(String softIdentifier) {
        this.softIdentifier = softIdentifier == null ? null : softIdentifier.trim();
    }

    public String getActivationNumber() {
        return activationNumber;
    }

    public void setActivationNumber(String activationNumber) {
        this.activationNumber = activationNumber == null ? null : activationNumber.trim();
    }

    public Date getActivationValidThru() {
        return activationValidThru;
    }

    public void setActivationValidThru(Date activationValidThru) {
        this.activationValidThru = activationValidThru;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId == null ? null : currencyUomId.trim();
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId == null ? null : fixedAssetId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}