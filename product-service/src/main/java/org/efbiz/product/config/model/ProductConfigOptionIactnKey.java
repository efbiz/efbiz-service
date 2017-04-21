package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.model.BaseEntity;

public class ProductConfigOptionIactnKey extends BaseEntity implements Serializable {
    private String configItemId;

    private String configOptionId;

    private String configItemIdTo;

    private String configOptionIdTo;

    private BigDecimal sequenceNum;

    private static final long serialVersionUID = 1L;

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

    public String getConfigItemIdTo() {
        return configItemIdTo;
    }

    public void setConfigItemIdTo(String configItemIdTo) {
        this.configItemIdTo = configItemIdTo == null ? null : configItemIdTo.trim();
    }

    public String getConfigOptionIdTo() {
        return configOptionIdTo;
    }

    public void setConfigOptionIdTo(String configOptionIdTo) {
        this.configOptionIdTo = configOptionIdTo == null ? null : configOptionIdTo.trim();
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