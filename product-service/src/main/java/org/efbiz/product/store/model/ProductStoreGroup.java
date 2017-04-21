package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class ProductStoreGroup extends BaseEntity implements Serializable {
    private String productStoreGroupId;

    private String productStoreGroupTypeId;

    private String primaryParentGroupId;

    private String productStoreGroupName;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getProductStoreGroupId() {
        return productStoreGroupId;
    }

    public void setProductStoreGroupId(String productStoreGroupId) {
        this.productStoreGroupId = productStoreGroupId == null ? null : productStoreGroupId.trim();
    }

    public String getProductStoreGroupTypeId() {
        return productStoreGroupTypeId;
    }

    public void setProductStoreGroupTypeId(String productStoreGroupTypeId) {
        this.productStoreGroupTypeId = productStoreGroupTypeId == null ? null : productStoreGroupTypeId.trim();
    }

    public String getPrimaryParentGroupId() {
        return primaryParentGroupId;
    }

    public void setPrimaryParentGroupId(String primaryParentGroupId) {
        this.primaryParentGroupId = primaryParentGroupId == null ? null : primaryParentGroupId.trim();
    }

    public String getProductStoreGroupName() {
        return productStoreGroupName;
    }

    public void setProductStoreGroupName(String productStoreGroupName) {
        this.productStoreGroupName = productStoreGroupName == null ? null : productStoreGroupName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}