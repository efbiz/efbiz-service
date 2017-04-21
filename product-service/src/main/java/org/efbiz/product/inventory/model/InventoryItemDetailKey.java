package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class InventoryItemDetailKey extends BaseEntity implements Serializable {
    private String inventoryItemId;

    private String inventoryItemDetailSeqId;

    private static final long serialVersionUID = 1L;

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId == null ? null : inventoryItemId.trim();
    }

    public String getInventoryItemDetailSeqId() {
        return inventoryItemDetailSeqId;
    }

    public void setInventoryItemDetailSeqId(String inventoryItemDetailSeqId) {
        this.inventoryItemDetailSeqId = inventoryItemDetailSeqId == null ? null : inventoryItemDetailSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}