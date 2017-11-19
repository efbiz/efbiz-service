package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class FacilityType extends ObjectValue implements Serializable {
    private String facilityTypeId;

    private String parentTypeId;

    private String hasTable;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId == null ? null : facilityTypeId.trim();
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