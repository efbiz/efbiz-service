package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class Container extends ObjectValue implements Serializable {
    private String containerId;

    private String containerTypeId;

    private String facilityId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId == null ? null : containerId.trim();
    }

    public String getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(String containerTypeId) {
        this.containerTypeId = containerTypeId == null ? null : containerTypeId.trim();
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
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