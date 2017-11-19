package org.efbiz.product.supplier.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class SupplierProductKey extends ObjectValue implements Serializable {
    private String productId;

    private String partyId;

    private String currencyUomId;

    private BigDecimal minimumOrderQuantity;

    private Date availableFromDate;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId == null ? null : currencyUomId.trim();
    }

    public BigDecimal getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(BigDecimal minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public Date getAvailableFromDate() {
        return availableFromDate;
    }

    public void setAvailableFromDate(Date availableFromDate) {
        this.availableFromDate = availableFromDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}