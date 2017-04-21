package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.inventory.model.InventoryItemDetailKey;

public class InventoryItemDetail extends InventoryItemDetailKey implements Serializable {
    private Date effectiveDate;

    private BigDecimal quantityOnHandDiff;

    private BigDecimal availableToPromiseDiff;

    private BigDecimal accountingQuantityDiff;

    private BigDecimal unitCost;

    private String orderId;

    private String orderItemSeqId;

    private String shipGroupSeqId;

    private String shipmentId;

    private String shipmentItemSeqId;

    private String returnId;

    private String returnItemSeqId;

    private String workEffortId;

    private String fixedAssetId;

    private String maintHistSeqId;

    private String itemIssuanceId;

    private String receiptId;

    private String physicalInventoryId;

    private String reasonEnumId;

    private String description;

    private static final long serialVersionUID = 1L;

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BigDecimal getQuantityOnHandDiff() {
        return quantityOnHandDiff;
    }

    public void setQuantityOnHandDiff(BigDecimal quantityOnHandDiff) {
        this.quantityOnHandDiff = quantityOnHandDiff;
    }

    public BigDecimal getAvailableToPromiseDiff() {
        return availableToPromiseDiff;
    }

    public void setAvailableToPromiseDiff(BigDecimal availableToPromiseDiff) {
        this.availableToPromiseDiff = availableToPromiseDiff;
    }

    public BigDecimal getAccountingQuantityDiff() {
        return accountingQuantityDiff;
    }

    public void setAccountingQuantityDiff(BigDecimal accountingQuantityDiff) {
        this.accountingQuantityDiff = accountingQuantityDiff;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
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

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId == null ? null : shipGroupSeqId.trim();
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId == null ? null : shipmentId.trim();
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId == null ? null : shipmentItemSeqId.trim();
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId == null ? null : returnId.trim();
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId == null ? null : returnItemSeqId.trim();
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId == null ? null : workEffortId.trim();
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId == null ? null : fixedAssetId.trim();
    }

    public String getMaintHistSeqId() {
        return maintHistSeqId;
    }

    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId == null ? null : maintHistSeqId.trim();
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId == null ? null : itemIssuanceId.trim();
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId == null ? null : receiptId.trim();
    }

    public String getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId == null ? null : physicalInventoryId.trim();
    }

    public String getReasonEnumId() {
        return reasonEnumId;
    }

    public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId == null ? null : reasonEnumId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}