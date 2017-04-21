package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.price.model.ProductPriceActionKey;

public class ProductPriceAction extends ProductPriceActionKey implements Serializable {
    private String productPriceActionTypeId;

    private BigDecimal amount;

    private String rateCode;

    private static final long serialVersionUID = 1L;

    public String getProductPriceActionTypeId() {
        return productPriceActionTypeId;
    }

    public void setProductPriceActionTypeId(String productPriceActionTypeId) {
        this.productPriceActionTypeId = productPriceActionTypeId == null ? null : productPriceActionTypeId.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode == null ? null : rateCode.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}