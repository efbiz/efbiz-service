package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.facility.model.ProductFacilityKey;

public class ProductFacility extends ProductFacilityKey implements Serializable {
    private BigDecimal minimumStock;

    private BigDecimal reorderQuantity;

    private BigDecimal daysToShip;

    private BigDecimal lastInventoryCount;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }

    public BigDecimal getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public BigDecimal getDaysToShip() {
        return daysToShip;
    }

    public void setDaysToShip(BigDecimal daysToShip) {
        this.daysToShip = daysToShip;
    }

    public BigDecimal getLastInventoryCount() {
        return lastInventoryCount;
    }

    public void setLastInventoryCount(BigDecimal lastInventoryCount) {
        this.lastInventoryCount = lastInventoryCount;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}