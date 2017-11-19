package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductPromoCodePartyKey extends ObjectValue implements Serializable {
    private String productPromoCodeId;

    private String partyId;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}