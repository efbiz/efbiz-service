package org.efbiz.product.cost.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.cost.model.CostComponentTypeAttrKey;

public class CostComponentTypeAttr extends CostComponentTypeAttrKey implements Serializable {
    private String description;

    private static final long serialVersionUID = 1L;

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