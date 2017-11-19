package org.efbiz.product.category.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class ProductCategoryTypeAttrKey extends ObjectValue implements Serializable {
    private String productCategoryTypeId;

    private String attrName;

    private static final long serialVersionUID = 1L;

    public String getProductCategoryTypeId() {
        return productCategoryTypeId;
    }

    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId == null ? null : productCategoryTypeId.trim();
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}