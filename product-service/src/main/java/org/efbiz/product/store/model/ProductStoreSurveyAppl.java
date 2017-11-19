package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreSurveyAppl extends ObjectValue implements Serializable {
    private String productStoreSurveyId;

    private String productStoreId;

    private String surveyApplTypeId;

    private String groupName;

    private String surveyId;

    private String productId;

    private String productCategoryId;

    private Date fromDate;

    private Date thruDate;

    private String surveyTemplate;

    private String resultTemplate;

    private BigDecimal sequenceNum;

    private static final long serialVersionUID = 1L;

    public String getProductStoreSurveyId() {
        return productStoreSurveyId;
    }

    public void setProductStoreSurveyId(String productStoreSurveyId) {
        this.productStoreSurveyId = productStoreSurveyId == null ? null : productStoreSurveyId.trim();
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
    }

    public String getSurveyApplTypeId() {
        return surveyApplTypeId;
    }

    public void setSurveyApplTypeId(String surveyApplTypeId) {
        this.surveyApplTypeId = surveyApplTypeId == null ? null : surveyApplTypeId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId == null ? null : surveyId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
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

    public String getSurveyTemplate() {
        return surveyTemplate;
    }

    public void setSurveyTemplate(String surveyTemplate) {
        this.surveyTemplate = surveyTemplate == null ? null : surveyTemplate.trim();
    }

    public String getResultTemplate() {
        return resultTemplate;
    }

    public void setResultTemplate(String resultTemplate) {
        this.resultTemplate = resultTemplate == null ? null : resultTemplate.trim();
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}