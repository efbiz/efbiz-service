package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.model.BaseEntity;

public class ProductCategoryRoleKey extends BaseEntity implements Serializable {
    private String productCategoryId;

    private String partyId;

    private String roleTypeId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId == null ? null : productCategoryId.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId == null ? null : roleTypeId.trim();
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