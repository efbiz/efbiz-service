package org.efbiz.product.supplier.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ReorderGuideline extends ObjectValue implements Serializable {
    private String reorderGuidelineId;

    private String productId;

    private String partyId;

    private String roleTypeId;

    private String facilityId;

    private String geoId;

    private Date fromDate;

    private Date thruDate;

    private BigDecimal reorderQuantity;

    private BigDecimal reorderLevel;

    private static final long serialVersionUID = 1L;

    public String getReorderGuidelineId() {
        return reorderGuidelineId;
    }

    public void setReorderGuidelineId(String reorderGuidelineId) {
        this.reorderGuidelineId = reorderGuidelineId == null ? null : reorderGuidelineId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId == null ? null : roleTypeId.trim();
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId == null ? null : geoId.trim();
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public BigDecimal getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(BigDecimal reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}