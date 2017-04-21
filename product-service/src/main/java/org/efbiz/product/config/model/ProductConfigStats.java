package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.product.config.model.ProductConfigStatsKey;

public class ProductConfigStats extends ProductConfigStatsKey implements Serializable {
    private BigDecimal numOfConfs;

    private String configTypeId;

    private static final long serialVersionUID = 1L;

    public BigDecimal getNumOfConfs() {
        return numOfConfs;
    }

    public void setNumOfConfs(BigDecimal numOfConfs) {
        this.numOfConfs = numOfConfs;
    }

    public String getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(String configTypeId) {
        this.configTypeId = configTypeId == null ? null : configTypeId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}