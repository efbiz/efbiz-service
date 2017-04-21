package org.efbiz.product.cost.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class CostComponentType extends BaseEntity implements Serializable {
    private String costComponentTypeId;

    private String parentTypeId;

    private String hasTable;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getCostComponentTypeId() {
        return costComponentTypeId;
    }

    public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId == null ? null : costComponentTypeId.trim();
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId == null ? null : parentTypeId.trim();
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