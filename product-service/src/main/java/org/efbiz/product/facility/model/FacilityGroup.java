package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class FacilityGroup extends ObjectValue implements Serializable {
    private String facilityGroupId;

    private String facilityGroupTypeId;

    private String primaryParentGroupId;

    private String facilityGroupName;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getFacilityGroupId() {
        return facilityGroupId;
    }

    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId == null ? null : facilityGroupId.trim();
    }

    public String getFacilityGroupTypeId() {
        return facilityGroupTypeId;
    }

    public void setFacilityGroupTypeId(String facilityGroupTypeId) {
        this.facilityGroupTypeId = facilityGroupTypeId == null ? null : facilityGroupTypeId.trim();
    }

    public String getPrimaryParentGroupId() {
        return primaryParentGroupId;
    }

    public void setPrimaryParentGroupId(String primaryParentGroupId) {
        this.primaryParentGroupId = primaryParentGroupId == null ? null : primaryParentGroupId.trim();
    }

    public String getFacilityGroupName() {
        return facilityGroupName;
    }

    public void setFacilityGroupName(String facilityGroupName) {
        this.facilityGroupName = facilityGroupName == null ? null : facilityGroupName.trim();
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