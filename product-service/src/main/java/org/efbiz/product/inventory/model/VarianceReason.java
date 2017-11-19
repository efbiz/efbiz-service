package org.efbiz.product.inventory.model;

import com.google.gson.Gson;
import java.io.Serializable;

import org.efbiz.common.model.ObjectValue;

public class VarianceReason extends ObjectValue implements Serializable {
    private String varianceReasonId;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId == null ? null : varianceReasonId.trim();
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