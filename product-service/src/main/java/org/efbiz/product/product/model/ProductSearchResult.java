package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductSearchResult extends ObjectValue implements Serializable {
    private String productSearchResultId;

    private String visitId;

    private String orderByName;

    private String isAscending;

    private BigDecimal numResults;

    private Double secondsTotal;

    private Date searchDate;

    private static final long serialVersionUID = 1L;

    public String getProductSearchResultId() {
        return productSearchResultId;
    }

    public void setProductSearchResultId(String productSearchResultId) {
        this.productSearchResultId = productSearchResultId == null ? null : productSearchResultId.trim();
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
    }

    public String getOrderByName() {
        return orderByName;
    }

    public void setOrderByName(String orderByName) {
        this.orderByName = orderByName == null ? null : orderByName.trim();
    }

    public String getIsAscending() {
        return isAscending;
    }

    public void setIsAscending(String isAscending) {
        this.isAscending = isAscending == null ? null : isAscending.trim();
    }

    public BigDecimal getNumResults() {
        return numResults;
    }

    public void setNumResults(BigDecimal numResults) {
        this.numResults = numResults;
    }

    public Double getSecondsTotal() {
        return secondsTotal;
    }

    public void setSecondsTotal(Double secondsTotal) {
        this.secondsTotal = secondsTotal;
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}