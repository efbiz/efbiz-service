package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductGroupOrder extends ObjectValue implements Serializable {
    private String groupOrderId;

    private String productId;

    private Date fromDate;

    private Date thruDate;

    private String statusId;

    private BigDecimal reqOrderQty;

    private BigDecimal soldOrderQty;

    private String jobId;

    private static final long serialVersionUID = 1L;

    public String getGroupOrderId() {
        return groupOrderId;
    }

    public void setGroupOrderId(String groupOrderId) {
        this.groupOrderId = groupOrderId == null ? null : groupOrderId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
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

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }

    public BigDecimal getReqOrderQty() {
        return reqOrderQty;
    }

    public void setReqOrderQty(BigDecimal reqOrderQty) {
        this.reqOrderQty = reqOrderQty;
    }

    public BigDecimal getSoldOrderQty() {
        return soldOrderQty;
    }

    public void setSoldOrderQty(BigDecimal soldOrderQty) {
        this.soldOrderQty = soldOrderQty;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}