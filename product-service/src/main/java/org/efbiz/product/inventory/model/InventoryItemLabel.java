package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class InventoryItemLabel extends ObjectValue implements Serializable {
    private String inventoryItemLabelId;

    private String inventoryItemLabelTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getInventoryItemLabelId() {
        return inventoryItemLabelId;
    }

    public void setInventoryItemLabelId(String inventoryItemLabelId) {
        this.inventoryItemLabelId = inventoryItemLabelId == null ? null : inventoryItemLabelId.trim();
    }

    public String getInventoryItemLabelTypeId() {
        return inventoryItemLabelTypeId;
    }

    public void setInventoryItemLabelTypeId(String inventoryItemLabelTypeId) {
        this.inventoryItemLabelTypeId = inventoryItemLabelTypeId == null ? null : inventoryItemLabelTypeId.trim();
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