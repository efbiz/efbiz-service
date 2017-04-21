package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.product.model.ProductMaintKey;

public class ProductMaint extends ProductMaintKey implements Serializable {
    private String productMaintTypeId;

    private String maintName;

    private String maintTemplateWorkEffortId;

    private BigDecimal intervalQuantity;

    private String intervalUomId;

    private String intervalMeterTypeId;

    private BigDecimal repeatCount;

    private static final long serialVersionUID = 1L;

    public String getProductMaintTypeId() {
        return productMaintTypeId;
    }

    public void setProductMaintTypeId(String productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId == null ? null : productMaintTypeId.trim();
    }

    public String getMaintName() {
        return maintName;
    }

    public void setMaintName(String maintName) {
        this.maintName = maintName == null ? null : maintName.trim();
    }

    public String getMaintTemplateWorkEffortId() {
        return maintTemplateWorkEffortId;
    }

    public void setMaintTemplateWorkEffortId(String maintTemplateWorkEffortId) {
        this.maintTemplateWorkEffortId = maintTemplateWorkEffortId == null ? null : maintTemplateWorkEffortId.trim();
    }

    public BigDecimal getIntervalQuantity() {
        return intervalQuantity;
    }

    public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
    }

    public String getIntervalUomId() {
        return intervalUomId;
    }

    public void setIntervalUomId(String intervalUomId) {
        this.intervalUomId = intervalUomId == null ? null : intervalUomId.trim();
    }

    public String getIntervalMeterTypeId() {
        return intervalMeterTypeId;
    }

    public void setIntervalMeterTypeId(String intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId == null ? null : intervalMeterTypeId.trim();
    }

    public BigDecimal getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(BigDecimal repeatCount) {
        this.repeatCount = repeatCount;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}