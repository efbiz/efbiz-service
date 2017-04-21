package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.feature.model.ProductFeatureDataResourceKey;

public class ProductFeatureDataResource extends ProductFeatureDataResourceKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}