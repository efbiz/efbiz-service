package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class FacilityContactMechKey extends BaseEntity implements Serializable {
    private String facilityId;

    private String contactMechId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId == null ? null : contactMechId.trim();
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