package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class InventoryItemVarianceKey extends ObjectValue implements Serializable {
    private String inventoryItemId;

    private String physicalInventoryId;

    private static final long serialVersionUID = 1L;

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId == null ? null : inventoryItemId.trim();
    }

    public String getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId == null ? null : physicalInventoryId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}