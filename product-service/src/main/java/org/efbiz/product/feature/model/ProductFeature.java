package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.model.BaseEntity;

public class ProductFeature extends BaseEntity implements Serializable {
    private String productFeatureId;

    private String productFeatureTypeId;

    private String productFeatureCategoryId;

    private String description;

    private String uomId;

    private BigDecimal numberSpecified;

    private BigDecimal defaultAmount;

    private BigDecimal defaultSequenceNum;

    private String abbrev;

    private String idCode;

    private static final long serialVersionUID = 1L;

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId == null ? null : productFeatureId.trim();
    }

    public String getProductFeatureTypeId() {
        return productFeatureTypeId;
    }

    public void setProductFeatureTypeId(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId == null ? null : productFeatureTypeId.trim();
    }

    public String getProductFeatureCategoryId() {
        return productFeatureCategoryId;
    }

    public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId == null ? null : productFeatureCategoryId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId == null ? null : uomId.trim();
    }

    public BigDecimal getNumberSpecified() {
        return numberSpecified;
    }

    public void setNumberSpecified(BigDecimal numberSpecified) {
        this.numberSpecified = numberSpecified;
    }

    public BigDecimal getDefaultAmount() {
        return defaultAmount;
    }

    public void setDefaultAmount(BigDecimal defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    public BigDecimal getDefaultSequenceNum() {
        return defaultSequenceNum;
    }

    public void setDefaultSequenceNum(BigDecimal defaultSequenceNum) {
        this.defaultSequenceNum = defaultSequenceNum;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev == null ? null : abbrev.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}