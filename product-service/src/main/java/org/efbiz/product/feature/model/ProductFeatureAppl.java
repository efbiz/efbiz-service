package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.product.feature.model.ProductFeatureApplKey;

public class ProductFeatureAppl extends ProductFeatureApplKey implements Serializable {
    private String productFeatureApplTypeId;

    private Date thruDate;

    private BigDecimal sequenceNum;

    private BigDecimal amount;

    private BigDecimal recurringAmount;

    private static final long serialVersionUID = 1L;

    public String getProductFeatureApplTypeId() {
        return productFeatureApplTypeId;
    }

    public void setProductFeatureApplTypeId(String productFeatureApplTypeId) {
        this.productFeatureApplTypeId = productFeatureApplTypeId == null ? null : productFeatureApplTypeId.trim();
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRecurringAmount() {
        return recurringAmount;
    }

    public void setRecurringAmount(BigDecimal recurringAmount) {
        this.recurringAmount = recurringAmount;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}