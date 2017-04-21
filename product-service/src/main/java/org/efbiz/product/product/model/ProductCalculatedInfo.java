package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.math.BigDecimal;
import org.efbiz.model.BaseEntity;

public class ProductCalculatedInfo extends BaseEntity implements Serializable {
    private String productId;

    private BigDecimal totalQuantityOrdered;

    private BigDecimal totalTimesViewed;

    private BigDecimal averageCustomerRating;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getTotalQuantityOrdered() {
        return totalQuantityOrdered;
    }

    public void setTotalQuantityOrdered(BigDecimal totalQuantityOrdered) {
        this.totalQuantityOrdered = totalQuantityOrdered;
    }

    public BigDecimal getTotalTimesViewed() {
        return totalTimesViewed;
    }

    public void setTotalTimesViewed(BigDecimal totalTimesViewed) {
        this.totalTimesViewed = totalTimesViewed;
    }

    public BigDecimal getAverageCustomerRating() {
        return averageCustomerRating;
    }

    public void setAverageCustomerRating(BigDecimal averageCustomerRating) {
        this.averageCustomerRating = averageCustomerRating;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}