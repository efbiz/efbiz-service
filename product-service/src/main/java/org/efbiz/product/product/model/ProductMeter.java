package org.efbiz.product.product.model;

import com.google.gson.Gson;
import java.io.Serializable;
import org.efbiz.product.product.model.ProductMeterKey;

public class ProductMeter extends ProductMeterKey implements Serializable {
    private String meterUomId;

    private String meterName;

    private static final long serialVersionUID = 1L;

    public String getMeterUomId() {
        return meterUomId;
    }

    public void setMeterUomId(String meterUomId) {
        this.meterUomId = meterUomId == null ? null : meterUomId.trim();
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName == null ? null : meterName.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}