package org.efbiz.product.cost.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.model.BaseEntity;

public class CostComponentAttributeKey extends BaseEntity implements Serializable {
    private String costComponentId;

    private String attrName;

    private static final long serialVersionUID = 1L;

    public String getCostComponentId() {
        return costComponentId;
    }

    public void setCostComponentId(String costComponentId) {
        this.costComponentId = costComponentId == null ? null : costComponentId.trim();
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