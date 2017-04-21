package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.store.model.ProductStoreVendorPaymentKey;

public class ProductStoreVendorPayment extends ProductStoreVendorPaymentKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}