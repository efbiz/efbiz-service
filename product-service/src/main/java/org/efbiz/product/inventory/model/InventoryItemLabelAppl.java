package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.inventory.model.InventoryItemLabelApplKey;

public class InventoryItemLabelAppl extends InventoryItemLabelApplKey implements Serializable {
    private String inventoryItemLabelId;

    private BigDecimal sequenceNum;

    private static final long serialVersionUID = 1L;

    public String getInventoryItemLabelId() {
        return inventoryItemLabelId;
    }

    public void setInventoryItemLabelId(String inventoryItemLabelId) {
        this.inventoryItemLabelId = inventoryItemLabelId == null ? null : inventoryItemLabelId.trim();
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}