package org.efbiz.product.price.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductPriceAutoNotice extends BaseEntity implements Serializable {
    private String productPriceNoticeId;

    private String facilityId;

    private Date runDate;

    private Date fromDate;

    private Date thruDate;

    private static final long serialVersionUID = 1L;

    public String getProductPriceNoticeId() {
        return productPriceNoticeId;
    }

    public void setProductPriceNoticeId(String productPriceNoticeId) {
        this.productPriceNoticeId = productPriceNoticeId == null ? null : productPriceNoticeId.trim();
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public Date getRunDate() {
        return runDate;
    }

    public void setRunDate(Date runDate) {
        this.runDate = runDate;
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

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}