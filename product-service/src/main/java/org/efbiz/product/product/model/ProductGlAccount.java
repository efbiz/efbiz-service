package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.product.model.ProductGlAccountKey;

public class ProductGlAccount extends ProductGlAccountKey implements Serializable {
    private String glAccountId;

    private static final long serialVersionUID = 1L;

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId == null ? null : glAccountId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}