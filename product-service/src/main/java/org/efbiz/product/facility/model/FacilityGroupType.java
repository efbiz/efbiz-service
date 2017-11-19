package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class FacilityGroupType extends ObjectValue implements Serializable {
    private String facilityGroupTypeId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getFacilityGroupTypeId() {
        return facilityGroupTypeId;
    }

    public void setFacilityGroupTypeId(String facilityGroupTypeId) {
        this.facilityGroupTypeId = facilityGroupTypeId == null ? null : facilityGroupTypeId.trim();
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