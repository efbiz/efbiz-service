package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.inventory.model.InventoryItemVarianceKey;

public class InventoryItemVariance extends InventoryItemVarianceKey implements Serializable {
    private String varianceReasonId;

    private BigDecimal availableToPromiseVar;

    private BigDecimal quantityOnHandVar;

    private String comments;

    private static final long serialVersionUID = 1L;

    public String getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId == null ? null : varianceReasonId.trim();
    }

    public BigDecimal getAvailableToPromiseVar() {
        return availableToPromiseVar;
    }

    public void setAvailableToPromiseVar(BigDecimal availableToPromiseVar) {
        this.availableToPromiseVar = availableToPromiseVar;
    }

    public BigDecimal getQuantityOnHandVar() {
        return quantityOnHandVar;
    }

    public void setQuantityOnHandVar(BigDecimal quantityOnHandVar) {
        this.quantityOnHandVar = quantityOnHandVar;
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