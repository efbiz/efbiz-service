package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class Facility extends ObjectValue implements Serializable {
    private String facilityId;

    private String facilityTypeId;

    private String parentFacilityId;

    private String ownerPartyId;

    private String defaultInventoryItemTypeId;

    private String facilityName;

    private String primaryFacilityGroupId;

    private BigDecimal squareFootage;

    private BigDecimal facilitySize;

    private String facilitySizeUomId;

    private String productStoreId;

    private BigDecimal defaultDaysToShip;

    private Date openedDate;

    private Date closedDate;

    private String description;

    private String defaultDimensionUomId;

    private String defaultWeightUomId;

    private String geoPointId;

    private static final long serialVersionUID = 1L;

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId == null ? null : facilityId.trim();
    }

    public String getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId == null ? null : facilityTypeId.trim();
    }

    public String getParentFacilityId() {
        return parentFacilityId;
    }

    public void setParentFacilityId(String parentFacilityId) {
        this.parentFacilityId = parentFacilityId == null ? null : parentFacilityId.trim();
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId == null ? null : ownerPartyId.trim();
    }

    public String getDefaultInventoryItemTypeId() {
        return defaultInventoryItemTypeId;
    }

    public void setDefaultInventoryItemTypeId(String defaultInventoryItemTypeId) {
        this.defaultInventoryItemTypeId = defaultInventoryItemTypeId == null ? null : defaultInventoryItemTypeId.trim();
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName == null ? null : facilityName.trim();
    }

    public String getPrimaryFacilityGroupId() {
        return primaryFacilityGroupId;
    }

    public void setPrimaryFacilityGroupId(String primaryFacilityGroupId) {
        this.primaryFacilityGroupId = primaryFacilityGroupId == null ? null : primaryFacilityGroupId.trim();
    }

    public BigDecimal getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(BigDecimal squareFootage) {
        this.squareFootage = squareFootage;
    }

    public BigDecimal getFacilitySize() {
        return facilitySize;
    }

    public void setFacilitySize(BigDecimal facilitySize) {
        this.facilitySize = facilitySize;
    }

    public String getFacilitySizeUomId() {
        return facilitySizeUomId;
    }

    public void setFacilitySizeUomId(String facilitySizeUomId) {
        this.facilitySizeUomId = facilitySizeUomId == null ? null : facilitySizeUomId.trim();
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public BigDecimal getDefaultDaysToShip() {
        return defaultDaysToShip;
    }

    public void setDefaultDaysToShip(BigDecimal defaultDaysToShip) {
        this.defaultDaysToShip = defaultDaysToShip;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDefaultDimensionUomId() {
        return defaultDimensionUomId;
    }

    public void setDefaultDimensionUomId(String defaultDimensionUomId) {
        this.defaultDimensionUomId = defaultDimensionUomId == null ? null : defaultDimensionUomId.trim();
    }

    public String getDefaultWeightUomId() {
        return defaultWeightUomId;
    }

    public void setDefaultWeightUomId(String defaultWeightUomId) {
        this.defaultWeightUomId = defaultWeightUomId == null ? null : defaultWeightUomId.trim();
    }

    public String getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId == null ? null : geoPointId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}