package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;

import org.efbiz.common.model.ObjectValue;

public class ConfigOptionProductOptionKey extends ObjectValue implements Serializable {
    private String configId;

    private String configItemId;

    private String configOptionId;

    private BigDecimal sequenceNum;

    private String productId;

    private static final long serialVersionUID = 1L;

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId == null ? null : configId.trim();
    }

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId == null ? null : configItemId.trim();
    }

    public String getConfigOptionId() {
        return configOptionId;
    }

    public void setConfigOptionId(String configOptionId) {
        this.configOptionId = configOptionId == null ? null : configOptionId.trim();
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}