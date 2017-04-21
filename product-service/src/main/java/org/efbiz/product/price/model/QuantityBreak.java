package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.model.BaseEntity;

public class QuantityBreak extends BaseEntity implements Serializable {
    private String quantityBreakId;

    private String quantityBreakTypeId;

    private BigDecimal fromQuantity;

    private BigDecimal thruQuantity;

    private static final long serialVersionUID = 1L;

    public String getQuantityBreakId() {
        return quantityBreakId;
    }

    public void setQuantityBreakId(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId == null ? null : quantityBreakId.trim();
    }

    public String getQuantityBreakTypeId() {
        return quantityBreakTypeId;
    }

    public void setQuantityBreakTypeId(String quantityBreakTypeId) {
        this.quantityBreakTypeId = quantityBreakTypeId == null ? null : quantityBreakTypeId.trim();
    }

    public BigDecimal getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(BigDecimal fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getThruQuantity() {
        return thruQuantity;
    }

    public void setThruQuantity(BigDecimal thruQuantity) {
        this.thruQuantity = thruQuantity;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}