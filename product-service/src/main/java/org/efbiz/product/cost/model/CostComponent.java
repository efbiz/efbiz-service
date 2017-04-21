package org.efbiz.product.cost.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class CostComponent extends BaseEntity implements Serializable {
    private String costComponentId;

    private String costComponentTypeId;

    private String productId;

    private String productFeatureId;

    private String partyId;

    private String geoId;

    private String workEffortId;

    private String fixedAssetId;

    private String costComponentCalcId;

    private Date fromDate;

    private Date thruDate;

    private BigDecimal cost;

    private String costUomId;

    private static final long serialVersionUID = 1L;

    public String getCostComponentId() {
        return costComponentId;
    }

    public void setCostComponentId(String costComponentId) {
        this.costComponentId = costComponentId == null ? null : costComponentId.trim();
    }

    public String getCostComponentTypeId() {
        return costComponentTypeId;
    }

    public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId == null ? null : costComponentTypeId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId == null ? null : productFeatureId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId == null ? null : geoId.trim();
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId == null ? null : workEffortId.trim();
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId == null ? null : fixedAssetId.trim();
    }

    public String getCostComponentCalcId() {
        return costComponentCalcId;
    }

    public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId == null ? null : costComponentCalcId.trim();
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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getCostUomId() {
        return costUomId;
    }

    public void setCostUomId(String costUomId) {
        this.costUomId = costUomId == null ? null : costUomId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}