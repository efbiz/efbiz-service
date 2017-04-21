package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductConfigOptionKey extends BaseEntity implements Serializable {
    private String configItemId;

    private String configOptionId;

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

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}