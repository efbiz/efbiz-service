package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductType extends ObjectValue implements Serializable {
    private String productTypeId;

    private String parentTypeId;

    private String isPhysical;

    private String isDigital;

    private String hasTable;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId == null ? null : productTypeId.trim();
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId == null ? null : parentTypeId.trim();
    }

    public String getIsPhysical() {
        return isPhysical;
    }

    public void setIsPhysical(String isPhysical) {
        this.isPhysical = isPhysical == null ? null : isPhysical.trim();
    }

    public String getIsDigital() {
        return isDigital;
    }

    public void setIsDigital(String isDigital) {
        this.isDigital = isDigital == null ? null : isDigital.trim();
    }

    public String getHasTable() {
        return hasTable;
    }

    public void setHasTable(String hasTable) {
        this.hasTable = hasTable == null ? null : hasTable.trim();
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