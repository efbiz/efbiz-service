package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductAssocKey extends BaseEntity implements Serializable {
    private String productId;

    private String productIdTo;

    private String productAssocTypeId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductIdTo() {
        return productIdTo;
    }

    public void setProductIdTo(String productIdTo) {
        this.productIdTo = productIdTo == null ? null : productIdTo.trim();
    }

    public String getProductAssocTypeId() {
        return productAssocTypeId;
    }

    public void setProductAssocTypeId(String productAssocTypeId) {
        this.productAssocTypeId = productAssocTypeId == null ? null : productAssocTypeId.trim();
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