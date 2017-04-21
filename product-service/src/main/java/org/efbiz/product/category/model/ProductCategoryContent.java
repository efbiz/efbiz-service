package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.category.model.ProductCategoryContentKey;

public class ProductCategoryContent extends ProductCategoryContentKey implements Serializable {
    private Date thruDate;

    private Date purchaseFromDate;

    private Date purchaseThruDate;

    private BigDecimal useCountLimit;

    private BigDecimal useDaysLimit;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(Date purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public Date getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(Date purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigDecimal getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigDecimal useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigDecimal getUseDaysLimit() {
        return useDaysLimit;
    }

    public void setUseDaysLimit(BigDecimal useDaysLimit) {
        this.useDaysLimit = useDaysLimit;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}