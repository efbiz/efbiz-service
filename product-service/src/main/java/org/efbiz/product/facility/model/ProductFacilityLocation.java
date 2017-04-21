package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.facility.model.ProductFacilityLocationKey;

public class ProductFacilityLocation extends ProductFacilityLocationKey implements Serializable {
    private BigDecimal minimumStock;

    private BigDecimal moveQuantity;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }

    public BigDecimal getMoveQuantity() {
        return moveQuantity;
    }

    public void setMoveQuantity(BigDecimal moveQuantity) {
        this.moveQuantity = moveQuantity;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}