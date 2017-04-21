package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.config.model.ProductConfigOptionKey;

public class ProductConfigOption extends ProductConfigOptionKey implements Serializable {
    private String configOptionName;

    private String description;

    private BigDecimal sequenceNum;

    private static final long serialVersionUID = 1L;

    public String getConfigOptionName() {
        return configOptionName;
    }

    public void setConfigOptionName(String configOptionName) {
        this.configOptionName = configOptionName == null ? null : configOptionName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}