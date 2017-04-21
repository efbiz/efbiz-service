package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.product.config.model.ProductConfigKey;

public class ProductConfig extends ProductConfigKey implements Serializable {
    private String description;

    private String configTypeId;

    private String defaultConfigOptionId;

    private Date thruDate;

    private String isMandatory;

    private String longDescription;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(String configTypeId) {
        this.configTypeId = configTypeId == null ? null : configTypeId.trim();
    }

    public String getDefaultConfigOptionId() {
        return defaultConfigOptionId;
    }

    public void setDefaultConfigOptionId(String defaultConfigOptionId) {
        this.defaultConfigOptionId = defaultConfigOptionId == null ? null : defaultConfigOptionId.trim();
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory == null ? null : isMandatory.trim();
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription == null ? null : longDescription.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}