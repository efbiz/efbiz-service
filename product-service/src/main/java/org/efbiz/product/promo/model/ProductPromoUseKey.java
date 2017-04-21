package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductPromoUseKey extends BaseEntity implements Serializable {
    private String orderId;

    private String promoSequenceId;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPromoSequenceId() {
        return promoSequenceId;
    }

    public void setPromoSequenceId(String promoSequenceId) {
        this.promoSequenceId = promoSequenceId == null ? null : promoSequenceId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}