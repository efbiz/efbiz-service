package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.promo.model.ProductPromoUseKey;

public class ProductPromoUse extends ProductPromoUseKey implements Serializable {
    private String productPromoId;

    private String productPromoCodeId;

    private String partyId;

    private BigDecimal totalDiscountAmount;

    private BigDecimal quantityLeftInActions;

    private static final long serialVersionUID = 1L;

    public String getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId == null ? null : productPromoId.trim();
    }

    public String getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId == null ? null : productPromoCodeId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public BigDecimal getQuantityLeftInActions() {
        return quantityLeftInActions;
    }

    public void setQuantityLeftInActions(BigDecimal quantityLeftInActions) {
        this.quantityLeftInActions = quantityLeftInActions;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}