package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.product.model.GoodIdentificationKey;

public class GoodIdentification extends GoodIdentificationKey implements Serializable {
    private String idValue;

    private static final long serialVersionUID = 1L;

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue == null ? null : idValue.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}