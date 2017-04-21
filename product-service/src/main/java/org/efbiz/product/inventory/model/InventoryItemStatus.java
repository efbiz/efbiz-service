package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.product.inventory.model.InventoryItemStatusKey;

public class InventoryItemStatus extends InventoryItemStatusKey implements Serializable {
    private Date statusEndDatetime;

    private String changeByUserLoginId;

    private String ownerPartyId;

    private String productId;

    private static final long serialVersionUID = 1L;

    public Date getStatusEndDatetime() {
        return statusEndDatetime;
    }

    public void setStatusEndDatetime(Date statusEndDatetime) {
        this.statusEndDatetime = statusEndDatetime;
    }

    public String getChangeByUserLoginId() {
        return changeByUserLoginId;
    }

    public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId == null ? null : changeByUserLoginId.trim();
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId == null ? null : ownerPartyId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}