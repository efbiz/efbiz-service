package org.efbiz.product.supplier.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.supplier.model.SupplierProductFeatureKey;

public class SupplierProductFeature extends SupplierProductFeatureKey implements Serializable {
    private String description;

    private String uomId;

    private String idCode;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId == null ? null : uomId.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}