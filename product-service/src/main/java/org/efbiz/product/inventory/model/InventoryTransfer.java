package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class InventoryTransfer extends BaseEntity implements Serializable {
    private String inventoryTransferId;

    private String statusId;

    private String inventoryItemId;

    private String facilityId;

    private String locationSeqId;

    private String containerId;

    private String facilityIdTo;

    private String locationSeqIdTo;

    private String containerIdTo;

    private String itemIssuanceId;

    private Date sendDate;

    private Date receiveDate;

    private String comments;

    private static final long serialVersionUID = 1L;

    public String getInventoryTransferId() {
        return inventoryTransferId;
    }

    public void setInventoryTransferId(String inventoryTransferId) {
        this.inventoryTransferId = inventoryTransferId == null ? null : inventoryTransferId.trim();
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId == null ? null : inventoryItemId.trim();
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId == null ? null : locationSeqId.trim();
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId == null ? null : containerId.trim();
    }

    public String getFacilityIdTo() {
        return facilityIdTo;
    }

    public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo == null ? null : facilityIdTo.trim();
    }

    public String getLocationSeqIdTo() {
        return locationSeqIdTo;
    }

    public void setLocationSeqIdTo(String locationSeqIdTo) {
        this.locationSeqIdTo = locationSeqIdTo == null ? null : locationSeqIdTo.trim();
    }

    public String getContainerIdTo() {
        return containerIdTo;
    }

    public void setContainerIdTo(String containerIdTo) {
        this.containerIdTo = containerIdTo == null ? null : containerIdTo.trim();
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId == null ? null : itemIssuanceId.trim();
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}