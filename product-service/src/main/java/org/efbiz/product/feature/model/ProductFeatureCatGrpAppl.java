package org.efbiz.product.feature.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.product.feature.model.ProductFeatureCatGrpApplKey;

public class ProductFeatureCatGrpAppl extends ProductFeatureCatGrpApplKey implements Serializable {
    private Date thruDate;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}