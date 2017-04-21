package org.efbiz.product.config.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductConfigItem extends BaseEntity implements Serializable {
    private String configItemId;

    private String configItemTypeId;

    private String configItemName;

    private String description;

    private String imageUrl;

    private String longDescription;

    private static final long serialVersionUID = 1L;

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId == null ? null : configItemId.trim();
    }

    public String getConfigItemTypeId() {
        return configItemTypeId;
    }

    public void setConfigItemTypeId(String configItemTypeId) {
        this.configItemTypeId = configItemTypeId == null ? null : configItemTypeId.trim();
    }

    public String getConfigItemName() {
        return configItemName;
    }

    public void setConfigItemName(String configItemName) {
        this.configItemName = configItemName == null ? null : configItemName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
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