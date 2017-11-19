package org.efbiz.product.catalog.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProdCatalogCategoryType extends ObjectValue implements Serializable {
    private String prodCatalogCategoryTypeId;

    private String parentTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProdCatalogCategoryTypeId() {
        return prodCatalogCategoryTypeId;
    }

    public void setProdCatalogCategoryTypeId(String prodCatalogCategoryTypeId) {
        this.prodCatalogCategoryTypeId = prodCatalogCategoryTypeId == null ? null : prodCatalogCategoryTypeId.trim();
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId == null ? null : parentTypeId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}