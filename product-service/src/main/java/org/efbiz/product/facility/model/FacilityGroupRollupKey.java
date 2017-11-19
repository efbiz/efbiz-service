package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class FacilityGroupRollupKey extends ObjectValue implements Serializable {
    private String facilityGroupId;

    private String parentFacilityGroupId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getFacilityGroupId() {
        return facilityGroupId;
    }

    public void setFacilityGroupId(String facilityGroupId) {
        this.facilityGroupId = facilityGroupId == null ? null : facilityGroupId.trim();
    }

    public String getParentFacilityGroupId() {
        return parentFacilityGroupId;
    }

    public void setParentFacilityGroupId(String parentFacilityGroupId) {
        this.parentFacilityGroupId = parentFacilityGroupId == null ? null : parentFacilityGroupId.trim();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}