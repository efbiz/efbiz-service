package org.efbiz.product.store.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import org.efbiz.product.store.model.ProductStoreKeywordOvrdKey;

public class ProductStoreKeywordOvrd extends ProductStoreKeywordOvrdKey implements Serializable {
    private Date thruDate;

    private String target;

    private String targetTypeEnumId;

    private static final long serialVersionUID = 1L;

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getTargetTypeEnumId() {
        return targetTypeEnumId;
    }

    public void setTargetTypeEnumId(String targetTypeEnumId) {
        this.targetTypeEnumId = targetTypeEnumId == null ? null : targetTypeEnumId.trim();
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}