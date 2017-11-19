package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

import org.efbiz.common.model.ObjectValue;

public class ProductStoreRoleKey extends ObjectValue implements Serializable {
    private String partyId;

    private String roleTypeId;

    private String productStoreId;

    private Date fromDate;

    private static final long serialVersionUID = 1L;

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

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId == null ? null : productStoreId.trim();
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