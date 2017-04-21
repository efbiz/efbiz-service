package org.efbiz.product.facility.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.facility.model.FacilityLocationKey;

public class FacilityLocation extends FacilityLocationKey implements Serializable {
    private String locationTypeEnumId;

    private String areaId;

    private String aisleId;

    private String sectionId;

    private String levelId;

    private String positionId;

    private String geoPointId;

    private static final long serialVersionUID = 1L;

    public String getLocationTypeEnumId() {
        return locationTypeEnumId;
    }

    public void setLocationTypeEnumId(String locationTypeEnumId) {
        this.locationTypeEnumId = locationTypeEnumId == null ? null : locationTypeEnumId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAisleId() {
        return aisleId;
    }

    public void setAisleId(String aisleId) {
        this.aisleId = aisleId == null ? null : aisleId.trim();
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId == null ? null : levelId.trim();
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
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