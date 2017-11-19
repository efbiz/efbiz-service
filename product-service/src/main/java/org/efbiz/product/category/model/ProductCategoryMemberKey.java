package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductCategoryMemberKey extends ObjectValue implements Serializable {
    private String productCategoryId;

    private String productId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
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

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}