package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.store.model.ProductStoreVendorShipmentKey;

public class ProductStoreVendorShipment extends ProductStoreVendorShipmentKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}