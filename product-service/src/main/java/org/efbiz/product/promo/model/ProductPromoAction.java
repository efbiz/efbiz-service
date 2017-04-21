package org.efbiz.product.promo.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.promo.model.ProductPromoActionKey;

public class ProductPromoAction extends ProductPromoActionKey implements Serializable {
    private String productPromoActionEnumId;

    private String orderAdjustmentTypeId;

    private String serviceName;

    private BigDecimal quantity;

    private BigDecimal amount;

    private String productId;

    private String partyId;

    private String useCartQuantity;

    private static final long serialVersionUID = 1L;

    public String getProductPromoActionEnumId() {
        return productPromoActionEnumId;
    }

    public void setProductPromoActionEnumId(String productPromoActionEnumId) {
        this.productPromoActionEnumId = productPromoActionEnumId == null ? null : productPromoActionEnumId.trim();
    }

    public String getOrderAdjustmentTypeId() {
        return orderAdjustmentTypeId;
    }

    public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId == null ? null : orderAdjustmentTypeId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

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

    public String getUseCartQuantity() {
        return useCartQuantity;
    }

    public void setUseCartQuantity(String useCartQuantity) {
        this.useCartQuantity = useCartQuantity == null ? null : useCartQuantity.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}