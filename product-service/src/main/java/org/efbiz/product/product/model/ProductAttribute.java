package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.product.model.ProductAttributeKey;

public class ProductAttribute extends ProductAttributeKey implements Serializable {
    private String attrValue;

    private String attrType;

    private String attrDescription;

    private static final long serialVersionUID = 1L;

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType == null ? null : attrType.trim();
    }

    public String getAttrDescription() {
        return attrDescription;
    }

    public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription == null ? null : attrDescription.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}