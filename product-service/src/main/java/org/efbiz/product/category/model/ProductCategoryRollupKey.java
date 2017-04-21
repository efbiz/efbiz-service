package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductCategoryRollupKey extends BaseEntity implements Serializable {
    private String productCategoryId;

    private String parentProductCategoryId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
    }

    public String getParentProductCategoryId() {
        return parentProductCategoryId;
    }

    public void setParentProductCategoryId(String parentProductCategoryId) {
        this.parentProductCategoryId = parentProductCategoryId == null ? null : parentProductCategoryId.trim();
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