package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductFacilityLocationKey extends BaseEntity implements Serializable {
    private String productId;

    private String facilityId;

    private String locationSeqId;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getLocationSeqId() {
        return locationSeqId;
    }

    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId == null ? null : locationSeqId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}